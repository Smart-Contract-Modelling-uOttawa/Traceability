package org.xtext.dsl.dxl.util;

import java.util.HashSet;

import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.Attribute;
import org.xtext.dsl.dxl.dxlDsl.Folder;
import org.xtext.dsl.dxl.dxlDsl.Module;
import org.xtext.dsl.dxl.dxlDsl.Class;

/**
 * 
 * @author Anisur Rahman
 *
 */
public class InitExitHelper {
	
	private static final String TAB = "\t";
	private static final String TAB2 = "\t\t";
	private static final String TAB3 = "\t\t\t";
	
	
	public static String getInitExitFileContent(Folder f){
		StringBuffer content = new StringBuffer();
	
		String fileComents = getFileComments();
		String checkCreateFolderMethodContents = getCheckCreateFolderMethodContents(f);
		String saveCloseAllModulesMethodContents = getSaveCloseAllModulesMethodContents();
		String checkDeletedModulesMethodContents = getCheckDeletedModulesMethodContents(f);
		String removeModuleMethodContents = getRemoveModuleMethodContents();
		String removeLinkModulesMethodContents = getRemoveLinkModulesMethodContents(f);
		String checkCreateModuleMethodContents = getCheckCreateModuleMethodContents(f);
		String checkCreateModulesMethodContents = getCheckCreateModulesMethodContents(f);
		String checkCreateLinkModulesMethodContents = getCheckCreateLinkModulesMethodContents(f);		
		String openModulesMethodContents = getOpenModulesMethodContents(f);
		String checkStartedFromModuleMethodContents = getCheckStartedFromModuleMethodContents(f);
		String saveCloseFinalMethodContents = getSaveCloseFinalMethodContents(f);
		
		
		content.append(fileComents);
		content.append(checkCreateFolderMethodContents);
		content.append(saveCloseAllModulesMethodContents);
		content.append(checkDeletedModulesMethodContents);
		content.append(removeModuleMethodContents );
		content.append(removeLinkModulesMethodContents );
		content.append(checkCreateModuleMethodContents );
		content.append(checkCreateModulesMethodContents );		
		content.append( checkCreateLinkModulesMethodContents );		
		content.append(openModulesMethodContents);
		content.append(checkStartedFromModuleMethodContents );
		content.append(saveCloseFinalMethodContents);
		return content.toString();
	}
	
	
	private static String getFileComments(){		
		String fileComments = "";
		fileComments += "/***************************************************************************************" + "\n";
		fileComments += "// Author Anisur Rahman 2012" + "\n";
		fileComments += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n";
		fileComments += "// - provides services for initialization and exit of applications" + "\n";
		fileComments += "*/" + "\n";
		
		fileComments += "\n\n\n";

		return fileComments;
	}
	
	
	private static String getCheckCreateFolderMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- checks if the UCM folder exists, and creates the folder if it does not exist" + "\n" ;
		contents += "//- returns true if folder was found or created successfully, false if it still does not exist" + "\n" ;		
		contents += "*/" + "\n" ;
				
		// method contents
		contents += "bool checkCreateFolder( string name, string description ) {" + "\n" ;
		contents += TAB + "bool createOK = false" + "\n" ;
		contents += TAB + "if( folder( name ) ) " + "\n" ;
		contents += TAB2 + GeneratorHelper.getFolderVariableName(f) + " = folder( name )" + "\n" ;
		contents += TAB + "else" + "\n" ;
		contents += TAB2 + GeneratorHelper.getFolderVariableName(f) + " = create( name, description )" + "\n" ;
		contents += TAB + "if( folder( name ) )" + "\n" ;
		contents += TAB2 + "createOK = true" + "\n" ;
		contents += TAB + "return createOK" + "\n" ;
		contents += "}" + "\n\n\n" ;
				
		
		return contents;
	}
	
	private static String getSaveCloseAllModulesMethodContents(){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- saves and closes all open modules in a folder" + "\n" ;
		contents += "//- returns false if a module remains open, true if all modules are closed" + "\n" ;
		contents += "*/" + "\n" ;
		
		// method contents		
		contents += "bool saveCloseAllModules( Folder theFolder ) {" + "\n" ;
		contents += TAB + "Module currentModule" + "\n" ;
		contents += TAB + "bool allClosed = true" + "\n" + "\n";
		contents += TAB + "// loops through all OPEN modules in a folder" + "\n" ;
		contents += TAB + "for currentModule in theFolder do {" + "\n" ;
		contents += TAB2 + "save currentModule" + "\n" ;
		contents += TAB2 + "close( currentModule, true )" + "\n" ;
		contents += TAB + "}" + "\n" ;
		contents += TAB + "for currentModule in theFolder do {" + "\n" ;
		contents += TAB2 + "allClosed = false" + "\n" ;
		contents += TAB2 + "break" + "\n" ;
		contents += TAB + "}" + "\n" ;
		contents += TAB + "return allClosed" + "\n" ;
		contents += "}" + "\n" ;
		
		return contents;
	}

	
	private static String getCheckDeletedModulesMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- checks whether one of the UCM modules has been deleted" + "\n" ;
		contents += "//- returns true if modules are not deleted, false if one of the modules is deleted" + "\n" ;
		contents += "*/" + "\n" ;
		
		//method contents
		contents += "bool checkDeletedModules() {" + "\n" ;
		contents += TAB + "bool checkOK = true" + "\n" ;
		contents += "\n" ;	
		
		
		for (Module m:f.getModule()){			
			
			// ;
			contents += TAB + "if ( exists module " + GeneratorHelper.getModuleFlieVariable(m)  + " ) {" + "\n" ;
			contents += TAB2 + "if (isDeleted item( " + GeneratorHelper.getModuleFlieVariable(m)  + " )){" + "\n" ;
			contents += TAB3 + "checkOK = false" + "\n" ;
			contents += TAB2 + "}" + "\n" ;
			contents += TAB + "}" + "\n" ;
			
			contents += "\n" ;			
		}
			
		contents += TAB + "return checkOK" + "\n" ;
		contents += "}" + "\n" ;
		
		return contents;
	}
	
	
	private static String getRemoveModuleMethodContents(){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- removes module" + "\n" ;
		contents += "//- returns true if module was removed, false if it still exists" + "\n" ;
		contents += "*/" + "\n" ;
		contents += "" + "\n" ;
		
		
		contents += "bool removeModule( string name ) {" + "\n" ;
		contents += TAB + "bool removeOK = true" + "\n" ;
		contents += TAB + "if( exists module name ) {" + "\n" ;		
		contents += TAB2 + "delete item name" + "\n" ;
		contents += TAB2 + "purge item name" + "\n" ;
		contents += TAB + "}" + "\n" ;
		
		contents += TAB + "if( exists module name )" + "\n" ;
		contents += TAB2 + "removeOK = false" + "\n" ;
		contents += TAB + "return removeOK" + "\n" ;
		contents += "}" + "\n" ;
		contents += "" + "\n" ;
		
		return contents;
	}
	

	
	private static String getRemoveLinkModulesMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- removes all UCM link modules" + "\n" ;
		contents += "//- returns true if modules were removed, false if one of the modules still exists" + "\n" ;
		contents += "*/" + "\n" ;
		
		//method contents
		contents += "bool removeLinkModules() {" + "\n" ;
		contents += TAB + "bool removeOK = true" + "\n" + "\n";
		
		int varCount = 0;
		
		int size = f.getAssociationType().size();
		
		for (AssociationType at: f.getAssociationType()){
			varCount++;
			
			for (int tabCount = 0; tabCount < varCount; tabCount++){
				contents += TAB;
			}
			
			contents += "removeOK = removeModule( " +GeneratorHelper.getLinkFileVariable(at) + " )" + "\n" ;
			
			// don't need this for the last one
			if (varCount != size){
				
				// to have a human readable code
				for (int tabCount = 0; tabCount < varCount; tabCount++){
					contents += TAB;
				}			
				contents += "if( removeOK ) {" + "\n" ;
				
			}						
		}
		
		//to match the indent 
		for(int i = varCount; i > 0 ;i--){
			
			if (i != varCount){
				for (int tabCount = 0; tabCount < i; tabCount++){
					contents += TAB;
				}
				
				contents += "}" + "\n" ;
				
			}				
		}
				
		contents += TAB + "return removeOK" + "\n" ;
		contents += "}" + "\n" ;
		contents += "" + "\n" ;
		
		return contents;
	}
	

	private static String getCheckCreateModuleMethodContents(Folder f){
		String contents = "";		
		HashSet<String> set = new HashSet<String>();
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- checks if module exists" + "\n" ;
		contents += "//	- if yes all objects of the module are set to deleted and to old" + "\n" ;
		contents += "//	- if no the module is created, views and linksets are also created at this time" + "\n" ;
		contents += "//- the following modules are created with this function" + "\n" ;
		contents += "//	- Devices, Components, Responsibilities, Maps, Scenarios" + "\n" ;
		contents += "//- assumptions for this function" + "\n" ;
		contents += "//	- if it is okay to do auto-completion of links, then externalLinkModule has been defined" + "\n" ;
		contents += "//- returns true if module was found or created successfully, false if it still does not exist" + "\n" ;
		contents += "*/" + "\n" ;
		
		//method contents
		contents += "bool checkCreateModule( string theName ) {" + "\n" ;
		contents += TAB + "Link l" + "\n" ;
		contents += TAB + "bool createOK = false, b" + "\n"  + "\n" ;
		contents += TAB + "if( exists module theName ) {" + "\n" ;
		contents += TAB2 + "currentModule = edit( theName, false )" + "\n" ;
		contents += TAB2 + "for currentObject in currentModule do {" + "\n" ;
		contents += TAB3 + "currentObject.\"Deleted\" = true" + "\n" ;
		contents += TAB3 + "currentObject.\"New\" = false" + "\n" ;
		contents += TAB2 + "}" + "\n" ;
		contents += TAB2 + "save currentModule" + "\n" ;
		contents += TAB2 + "close( currentModule, false )" + "\n" ;
		contents += TAB + "}" + "\n" ;
		contents += TAB + "else {" + "\n" ;
		contents += TAB2 + "// last parameter needs to be true because otherwise views cannot be created" + "\n" ;
		contents += TAB2 + "currentModule = create( theName, theName, \"0\", 1, true)" + "\n\n" ;
		contents += TAB2 + "current = currentModule" + "\n" ;
		
				
		for (Module m:f.getModule()){	
			set.clear();
			contents += "" + "\n" ;
			contents += TAB2 + "if( theName == " + GeneratorHelper.getModuleFlieVariable(m) + " ) {" + "\n" ;
			
			contents += TAB3 + "create object type \"String\" (default \"No content\") attribute \"ID\" " + "\n" ;
			contents += TAB3 + "create object type \"String\" (default \"No content\") attribute \"Name_\" " + "\n" ;
			contents += TAB3 + "create object type \"String\" (default \"\") attribute \"Description_\" " + "\n" ;
			
			set.add("ID");
			set.add("Name_");
			set.add("Description_");
			
			for (Class c:m.getClasses()){			
				//contents += "" + "\n" ;					
					for (Attribute a :c.getAttributes()){
						
						String attrValue = (a.getDefault() != null) ? a.getDefault() : a.getName() ;
						
						if(!set.contains(attrValue)){
							
							if( (a.getType().equals("string"))  ||(a.getType().equals("diagram")) )  {
								contents += TAB3 + "create object type \"String\" (default \"No content\") attribute \"" + attrValue + "\" " + "\n" ;
							}else if (a.getType().equals("int"))   {
								contents += TAB3 + "create object type \"Integer\" (default \"0\") attribute \"" + attrValue + "\" " + "\n" ;
							}
							
							
							set.add(attrValue);
						}						
					}									
			}
			
			if(GeneratorHelper.isModuleContainImage (m)||GeneratorHelper.isModuleContainAssociation(m)){
				if(!set.contains("ObjectType_")){					
					contents += TAB3 + "create object type \"String\" date false history false changeBars false (default \"\") attribute \"ObjectType_\" " + "\n" ;
				}
			}
				
			
			//TODO ::: check if need to modify for GRL Diagram and Map
			
			contents += "" + "\n" ;
			contents += TAB3 + "// internal attributes" + "\n" ;			
			contents += TAB3 + "create object type \"Text\" date false history false changeBars false (default \"No content\") attribute \"Suspect In Links\" " + "\n" ;
			contents += TAB3 + "create object type \"Text\" date false history false changeBars false (default \"No content\") attribute \"Suspect Out Links\"" + "\n" ;
			contents += TAB3 + "create object type \"Boolean\" date false history false changeBars false (default \"false\") attribute \"New\"" + "\n" ;
			contents += TAB3 + "create object type \"Boolean\" date false history false changeBars false (default \"false\") attribute \"Deleted\"" + "\n" ;
	

			
			//TODO::Content from URNViews.dxl is not in scope & out of requirement for this thesis. 
			//contents += "createActorViews()" + "\n" ;
				
			contents += TAB2 + "}" + "\n" ;		
			
			
		}
				
		//contents += TAB2 + "if( externalOK == 2 ) {" + "\n" ;
		//contents += TAB3 + "addLinkModuleDescriptor("+ GeneratorHelper.getFolderVariableName(f) + ", name( currentModule ), fileNameExternal, false, fileNameLinkUCMExt, \"\" )	" + "\n" ;
		//contents += TAB3 + "create( externalLinkModule, name( currentModule ), fileNameExternal )" + "\n" ;
		//contents += TAB2 + "}" + "\n" ;
		
		
		contents += TAB2 + "save currentModule" + "\n" ;
		contents += TAB2 + "close( currentModule, false )" + "\n" ;
		contents += TAB + "}" + "\n" ;
		contents += TAB + "if( exists module theName )" + "\n" ;
		contents += TAB2 + "createOK = true" + "\n" ;
		contents += TAB + "return createOK" + "\n" ;
		contents += "}" + "\n" ;		
		
		return contents;
	}
	
/*	
		
		
		
		if( theName == fileNameStrategy ) {
			create object type "String" (default "No content") attribute "ID" 
			create object type "String" (default "No content") attribute "Name_"          
			create object type "String" (default "") attribute "Description_"  
			create object type "String" (default "") attribute "Author"   
  
			// internal attributes
			create object type "Text" date false history false changeBars false (default "No content") attribute "Suspect In Links" 
			create object type "Text" date false history false changeBars false (default "No content") attribute "Suspect Out Links" 
			create object type "Boolean" date false history false changeBars false (default "false") attribute "New" 
			create object type "Boolean" date false history false changeBars false (default "false") attribute "Deleted" 
			createStrategyViews()
		}	
		
			
		if( theName == fileNameMaps ) {
			// for all
			create object type "String" (default "No content") attribute "ID" 
			create object type "String" (default "") attribute "Name_"             
			create object type "String" (default "") attribute "Description_"       
			create object type "String" (default "No content") attribute "Type"
			// only used for respRef, compRef, and stub
			create object type "Integer" date false history false changeBars false (default "0") attribute "Fx" 
			create object type "Integer" date false history false changeBars false (default "0") attribute "Fy"
			// only used for respRef and compRef
			create object type "String" (default "No content") attribute "Definition ID" 
			// only used for map
			create object type "String" (default "") attribute "Map Title"
			create object type "String" date false history false changeBars false (default "No content") attribute "Map File Name" 
			// only used for respRef
			create object type "String" (default "") attribute "Enclosing Component"             
			// only used for compRef
			create object type "Integer" date false history false changeBars false (default "0") attribute "Width" 
			create object type "Integer" date false history false changeBars false (default "0") attribute "Height" 
			create object type "String" (default "") attribute "Component Role" 
			create object type "String" (default "") attribute "Parent Component"       
			create object type "String" (default "no") attribute "Anchored" 
			// only used for stub
			create object type "String" date false history false changeBars false (default "No content") attribute "Stub Type" 
			create object type "String" (default "") attribute "Plugins" 
			// internal attributes
			create object type "Text" date false history false changeBars false (default "No content") attribute "Suspect In Links" 
			create object type "Text" date false history false changeBars false (default "No content") attribute "Suspect Out Links"
			create object type "Boolean" date false history false changeBars false (default "false") attribute "New" 
			create object type "Boolean" date false history false changeBars false (default "false") attribute "Deleted" 
			createMapViews()
		}
		
		
		if( theName == fileNameGrlDiagrams ) {
			// for all
			create object type "String" (default "No content") attribute "ID" 
			create object type "String" (default "") attribute "Name_"             
			create object type "String" (default "") attribute "Description_"       
			create object type "String" (default "No content") attribute "Type"
			// only used for respRef, compRef
			create object type "Integer" date false history false changeBars false (default "0") attribute "Fx" 
			create object type "Integer" date false history false changeBars false (default "0") attribute "Fy"
			create object type "String" (default "No content") attribute "Definition ID" 
			// only used for diagrams
			create object type "String" (default "") attribute "Diagram Title"
			create object type "String" date false history false changeBars false (default "No content") attribute "Diagram File Name" 
			// only used for actorRef
			create object type "Integer" date false history false changeBars false (default "0") attribute "Width" 
			create object type "Integer" date false history false changeBars false (default "0") attribute "Height"  
			create object type "String" (default "") attribute "Parent Actor"    
			// only used for intentional element ref and belief
			create object type "String" (default "") attribute "Enclosing Actor"  
			// only used for intentional element ref           
			create object type "String" (default "") attribute "Priority"
			create object type "String" (default "") attribute "Criticality"
			// only used for belief
			create object type "String" (default "") attribute "Author"
			create object type "String" (default "") attribute "Intentional Element ID"
			// only used for LinkRef
			create object type "String" (default "") attribute "Source ID"
			create object type "String" (default "") attribute "Destination ID"
			// internal attributes
			create object type "Text" date false history false changeBars false (default "No content") attribute "Suspect In Links" 
			create object type "Text" date false history false changeBars false (default "No content") attribute "Suspect Out Links"
			create object type "Boolean" date false history false changeBars false (default "false") attribute "New" 
			create object type "Boolean" date false history false changeBars false (default "false") attribute "Deleted" 
			createGrlDiagramViews()
		}
		


*/
	
	private static String getCheckCreateModulesMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher, Bo Jiang" + "\n" ;
		contents += "//- checks if all UCM modules exist, and creates them if not" + "\n" ;
		contents += "//- returns true if all modules were found or created successfully, false if one module still does not exist" + "\n" ;
		contents += "*/" + "\n" ;
		
		// method comments
		contents += "bool checkCreateModules() {" + "\n" ;		
		contents += TAB + "bool createOK = true" + "\n\n" ;
		
		
		for (Module m:f.getModule()){								
			contents += TAB + "if( createOK ) {" + "\n" ;
			contents += TAB2 + "if (!checkCreateModule( " + GeneratorHelper.getModuleFlieVariable(m) + " )){" + "\n" ;
			contents += TAB3 + "createOK = false" + "\n" ;
			contents += TAB2 + "}" + "\n" ;
			contents += TAB + "}" + "\n" ;								
		}
		
		contents += TAB + "return createOK" + "\n" ;		
		contents += "}" + "\n\n\n" ;
		
		
		return contents;
	}
		
	
	
	private static String getCheckCreateLinkModulesMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher" + "\n" ;
		contents += "//- checks if all  link modules exists, creates them if not, and opens them for editing" + "\n" ;
		contents += "//- returns true if successful, otherwise returns false" + "\n" ;
		contents += "//- assumptions for this function" + "\n" ;
		contents += "//	- the folder variable is set to current folder" + "\n" ;
		contents += "*/" + "\n" ;
		
		
		contents += "bool checkCreateLinkModules() {" + "\n" ;
		contents += TAB + "Module currentModule" + "\n\n" ;
		
		
		
		
		for (AssociationType at: f.getAssociationType()){				
			//bool hostsOK = false, requestsOK = false, etc...
			contents += TAB + "bool " + at.getName() + "OK = false" + "\n" ;
			
		}
		
		contents += "\n" ;
		
		for (AssociationType at: f.getAssociationType()){				
			contents += TAB + "if ( !( exists module " + GeneratorHelper.getLinkFileVariable(at) + " ) ) {" + "\n" ;
			//TODO: To decide when to assign to current & when not
			// Is it a bug in current version?
			
			//TODO: to have description -- what about DSL update?? Will be using name as a description for this thesis.
			//contents += "create( " + GeneratorHelper.getLinkFileVariable(at) + ", \"Sample DESCRIPTION\", manyToMany, false )" + "\n" ;
			//contents += TAB2 + "current = create( " + GeneratorHelper.getLinkFileVariable(at) + ", \"Sample DESCRIPTION\", manyToMany, false )" + "\n" ;
			contents += TAB2 + "current = create( " + GeneratorHelper.getLinkFileVariable(at) + ", \"" + GeneratorHelper.getLinkFileVariable(at) + "\", manyToMany, false )" + "\n" ;
			
			//TODO: To decide when to create additional object & what to do with these object
			//contents += "create object type \"Integer\" (default \"0\") attribute \"Quantity\"" + "\n" ;
			
			contents += TAB + "}" + "\n" ;
			
			
			contents += TAB + GeneratorHelper.getLinkModuleVariableName(at) + " = edit( " + GeneratorHelper.getLinkFileVariable(at) + ", false )" + "\n\n" ;
			
		}
				
		contents += "\n" ;
		contents += TAB + "for currentModule in current Folder do {" + "\n" ;
		contents += TAB2 + "if( isEdit( currentModule ) ) {" + "\n" ;
		
		for (AssociationType at: f.getAssociationType()){	
			contents += TAB3 + "if( currentModule.\"Name\" \"\" == " + GeneratorHelper.getLinkFileVariable(at) + " )" + "\n" ;
			contents +=  TAB3 + TAB + at.getName() + "OK = true" + "\n" ;
		
		}

		contents += TAB2 + "}" + "\n" ;
		contents += TAB + "}" + "\n" ;

			
		contents += TAB + "return ("  ;
		int count = 0;
		for (AssociationType at: f.getAssociationType()){				
			
			if (count != 0){
				contents += " &&" ;
			}
			
			contents += " " + at.getName() + "OK" ;
			count++;
		}
		
		contents += ")" + "\n" ;
		
		
		contents += "}" + "\n\n" ;
		
		return contents;
	}



	
	
	private static String getOpenModulesMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher" + "\n" ;
		contents += "//- opens all  modules in the folder for editing" + "\n" ;
		contents += "//- assumptions for this function" + "\n" ;
		contents += "//	- current folder is the folder variable for the folder" + "\n" ;		
		contents += "//- returns true if successful, otherwise returns false" + "\n" ;
		contents += "*/" + "\n" ;
		
		contents += "bool openModules() {" + "\n" ;
		
		contents += TAB + "Module currentModule" + "\n\n" ;		
		for (Module m:f.getModule()){			
			contents += TAB + "bool preparationOK" + StringUtil.getToFirstUpper(m.getName()) + " = false" + "\n" ;	
			contents += TAB + GeneratorHelper.getModuleVariableName(m) + " = edit( " + GeneratorHelper.getModuleFlieVariable(m) + ", false )" + "\n\n" ;			
		}
		
		contents += "\n" ;
		
		contents += TAB + "for currentModule in " +  GeneratorHelper.getFolderVariableName(f) + " do {" + "\n" ;			
		contents += TAB2 + "if( isEdit( currentModule ) ) {" + "\n" ;		
		for (Module m:f.getModule()){
			contents += TAB3 + "if( currentModule.\"Name\" \"\" == " + GeneratorHelper.getModuleFlieVariable(m) + " )" + "\n" ;
			contents += TAB3 + TAB + "preparationOK" + StringUtil.getToFirstUpper(m.getName()) + " = true" + "\n" ;			
		}		
	
		contents += TAB2 + "}" + "\n" ;	
		contents += TAB + "}" + "\n" ;		

		contents += TAB +"return ( " ;
		int count = 0;
		for (Module m:f.getModule()){	
			
			if (count!= 0 && count%4 == 0){
				contents += " && \n";
				contents += TAB2;
				count = 0;
			}
			
			if (count != 0){
				contents += " && ";
			}
			
			contents += "preparationOK" + StringUtil.getToFirstUpper(m.getName()) ;		
			count++;
		}		
		contents += " ) " + "\n" ;		
		contents += "}" + "\n" ;
		
		return contents;
	}
	

	
	private static String getCheckStartedFromModuleMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher" + "\n" ;
		contents += "//- checks whether program was started from a Module" + "\n" ;
		contents += "//- sets global variable for the Folder and the current folder to the folder variable" + "\n" ;
		contents += "//- returns true if successful, otherwise halts" + "\n" ;		
		contents += "*/" + "\n" ;
		
		
		//method contents
		contents += "bool checkStartedFromModule( string programName ) {" + "\n" ;
		
		contents += TAB + "string buttons[] = { \"Ok\" } " + "\n" ;
		contents += TAB + "string n" + "\n" ;		
		contents += "" + "\n" ;
		
		contents += TAB + "if( !( null( current Module ) ) ) {" + "\n" ;		
		contents += TAB2 + "debug(name( current Module ) \"\\n\", 2)" + "\n" ;		
		contents += TAB2 + "n = name( current Module )" + "\n" ;
			
		
		contents += TAB2 + "if(" ;
		int count = 0;
		for (Module m:f.getModule()){	
			
			if (count!= 0 && count%4 == 0){
				contents += " && \n";
				contents += TAB3;
				count = 0;
			}
			
			if (count != 0){
				contents += "&& ";
			}
			
			contents += " ( n != " + GeneratorHelper.getModuleFlieVariable(m) + " ) " ;		
			count++;
		}		
		
		contents += ") {" + "\n" ;
		
				
		contents += TAB3 + "messageBox( programName \" must be started from a URN module.\\nPlease select a URN module and start \" programName \" again.\\n\", buttons, msgError )" + "\n" ;
		contents += TAB3 + "halt" + "\n" ;
		contents += TAB2 + "}" + "\n" ;	
		
		contents += TAB + "}" + "\n" ;
		
		
		contents += TAB +"else {" + "\n" ;
		contents += TAB2 +"messageBox( programName \" must be started from a module.\\nPlease select a module and start \" programName \" again.\\n\", buttons, msgError )" + "\n" ;
		contents += TAB2 + "halt" + "\n" ;
		contents += TAB + "}	" + "\n" ;
		
				
		contents += TAB + "return true" + "\n" ;		
		contents += "}" + "\n" ;
		
			
		return contents;
	}
	
	
	
	private static String getSaveCloseFinalMethodContents(Folder f){
		String contents = "";
		
		//method comments
		contents += "/***************************************************************************************" + "\n" ;
		contents += "//Author Anisur Rahman, 2012" + "\n" ;
		contents += "// - Automated version Based on initial version by Gunter Mussbacher" + "\n" ;
		contents += "//- saves and closes all modules" + "\n" ;
		contents += "//- returns true if successful, otherwise returns false" + "\n" ;
		contents += "*/" + "\n" ;
		
		
		contents += "bool saveCloseFinal() {" + "\n" ;
		
		contents += TAB + "bool finalOK = false" + "\n" ;
		contents += TAB + "finalOK = saveCloseAllModules( " + GeneratorHelper.getFolderVariableName(f) + " )" + "\n" ;
		contents += TAB + "return finalOK" + "\n" ;
				
		contents += "}" + "\n" ;
		
		
		return contents;
	}
		

}

