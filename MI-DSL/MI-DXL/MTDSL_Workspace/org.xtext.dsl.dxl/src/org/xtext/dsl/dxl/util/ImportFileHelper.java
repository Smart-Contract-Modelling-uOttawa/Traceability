package org.xtext.dsl.dxl.util;

import org.xtext.dsl.dxl.config.StaticContentProvider;
import org.xtext.dsl.dxl.dxlDsl.Folder;
import org.xtext.dsl.dxl.dxlDsl.Module;

public class ImportFileHelper {
	private static final String TAB = "\t";
	private static final String TAB2 = "\t\t";
	private static final String TAB3 = "\t\t\t";
	
	public static String getImportFileContent(Folder f){
		String content = "";
		
		String fileComents = getImportFileComments();
		String beingImportMethodContents = getBeginImportMethodContents(f);
		String completeImportMethodContents = getCompleteImportMethodContents(f);
		
		content = fileComents + beingImportMethodContents + completeImportMethodContents;
		return content;
	}
	
	
	private static String getImportFileComments(){
		
		String fileComments = "";
		fileComments += "/***************************************************************************************" + "\n";
		fileComments += "// Author Anisur Rahman 2012" + "\n";
		fileComments += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n";
		fileComments += "// - performs initialization and exit functions when importing a UCM file into DOORS" + "\n";
		fileComments += "*/" + "\n";
		
		fileComments += "\n\n\n";

		return fileComments;
	}
	
	private static String getBeginImportMethodContents(Folder f){
		
		String contents = StaticContentProvider.getContentFromStaticFile("ImportStatic.dxl");
		String folderVariableName = GeneratorHelper.getFolderVariableName(f);
		contents = contents.replaceAll("\\$\\$Folder\\$\\$", folderVariableName);
		return contents;
	}
	

	private static String getCompleteImportMethodContents(Folder f){
		String contents = "";
		
		//method contents
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- removes all objects marked deleted in all formal modules" + "\n" ;
		contents += "//- creates links in all link modules" + "\n" ;
		contents += "//- saves and closes all formal and link modules" + "\n" ;
		contents += "//- halts if an error occurs, otherwise always returns true" + "\n" ;
		contents += "//- assumptions for this function" + "\n" ;
		contents += "//	- all formal and link modules exist and are ready to be used" + "\n" ;
		contents += "*/" + "\n" ;
		
		// method contents
		
		contents += "bool endImport() {" + "\n" ;		
		contents += TAB  + "string buttons[] = { \"Ok\" } " + "\n" ;
		contents += TAB  + "string feedback = \"One or more objects could not be removed because of external links.\\n\\n\"" + "\n\n" ;	
		contents += TAB  + "// in all formal modules, remove all objects marked deleted which are not linked to other modules" + "\n\n" ;	
		
		
		for (Module m:f.getModule()){
			contents += TAB  + "countDeletedNotRemoved = 0" + "\n" ;
			contents += TAB  + "removeDeletedObjects( " + GeneratorHelper.getModuleVariableName(m) + " )" + "\n" ;
			contents += TAB  + "if( countDeletedNotRemoved > 0 )" + "\n" ;	
			contents += TAB2  + "feedback = feedback \"in \" " + GeneratorHelper.getModuleFlieVariable(m) + " \": \" countDeletedNotRemoved \" object(s)\\n\"" + "\n\n" ;	
		}
				
		contents += TAB  + "if( feedback != \"One or more objects could not be removed because of external links.\\n\\n\" )" + "\n" ;
		contents += TAB2  + "messageBox( feedback, buttons, msgWarning)" + "\n" ;
		contents += TAB  + "debug(\"removed all deleted objects\\n\", 2)" + "\n" ;	
		contents += "" + "\n" ;	
		
		
		
		
		// create links in all module		
		contents += TAB  +"// create links in all link modules" + "\n" ;	
		for (Module m:f.getModule()){
			if (GeneratorHelper.isModuleContainAssociation(m)){
				//TODO:get a helper method to get the name of the method & also use it in the 'generateLink' Method in the Xtend file
				contents += TAB  + "create" + m.getName() +  "Links()" + "\n" ;					
			}
			
		}
		
		
		
		contents += TAB  + "debug(\"created links\\n\", 3)" + "\n" ;
		
		contents += "" + "\n\n" ;
		contents += TAB  + "// save and close all formal and link modules " + "\n" ;
		contents += TAB  + "if( !( saveCloseFinal() ) ) {" + "\n" ;		
		contents += TAB2  + "messageBox( \"The URN import has finished.\\n\\nOne or more of the modules in the URN folder or the external modules are still open.\\nPlease manually save and close all open formal and link modules.\", buttons, msgWarning)" + "\n" ;
		contents += TAB2  + "halt" + "\n" ;
		contents += TAB  + "}" + "\n\n" ;
		
		contents += TAB  + "debug(\"saved and closed\\n\", 3)" + "\n\n" ;
		contents += TAB  + "return true" + "\n" ;		
		contents += "}" + "\n" ;
		
		
		return contents;
	}

}





