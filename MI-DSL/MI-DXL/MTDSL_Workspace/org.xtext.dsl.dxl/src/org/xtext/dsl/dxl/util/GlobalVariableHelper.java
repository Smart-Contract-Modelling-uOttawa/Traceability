package org.xtext.dsl.dxl.util;

import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.Module;

public class GlobalVariableHelper {
	
	//public static String FOLDER_VARIABLE = "folder" ;
	
	public static String createDynamicContent(org.xtext.dsl.dxl.dxlDsl.Folder f){
		
		
		StringBuffer dc = new StringBuffer();
		
		// comments
		dc.append("\n\n");
		dc.append("// global variables\n");
		
		// folders
		dc.append("// folder \n");
		
		dc.append("Folder " +  GeneratorHelper.getFolderVariableName(f) + " \n");  
		//dc.append("Folder " +  FOLDER_VARIABLE + " \n");
		dc.append("\n");
		
		// modules

		dc.append("// all  formal modules \n");
		for (Module m:f.getModule()){
			dc.append("Module " + GeneratorHelper.getModuleVariableName(m) + " \n");			
		}
		
		//module for links
		dc.append("\n");
		dc.append("// Link modules \n");
		for (AssociationType at: f.getAssociationType()){				
			dc.append("Module " + GeneratorHelper.getLinkModuleVariableName(at) + " \n");
		}
		
		
		//Global String
		dc.append("\n\n") ;
		dc.append("// global constants\n") ;
		
		//***Start: support for including direct global constant will be removed
		//for (GlobalConst gc: f.getGlobalConst()){
		//	dc.append("const string " + gc.getName() + " = \"" + gc.getValue() + "\"  \n") ;			
		//}
		///***** End..
		
		
		dc.append("\n\n");
		
		for (Module m:f.getModule()){			
						
			dc.append("const string " + GeneratorHelper.getModuleFlieVariable(m) + " = \"" + getModuleFileName(m) + "\"  \n") ;
						
		}
		
		for (AssociationType at: f.getAssociationType()){
			//const string fileNameLinkMapComp = "Bound To"			
			dc.append("const string " +GeneratorHelper.getLinkFileVariable(at) + " = \"" + at.getLinkFileName() + "\"  \n") ;
			
		}

		/*
		if( GeneratorHelper.getExternalFileVariable (f) != null){
			dc.append("\n// global constants (relative to URN folder)\n");
			dc.append("const string " +GeneratorHelper.getExternalFileVariable (f) + " = \"" + f.getExternalFile().get(0).getFileName() + "\"  \n") ;			
		}
		
		if( GeneratorHelper.getExternalLinkFileVariable (f) != null){
			dc.append("const string " +GeneratorHelper.getExternalLinkFileVariable (f) + " = \"" + f.getExtLinkFile().get(0).getFileName() + "\"  \n") ;			
		}
		
		if( GeneratorHelper.getExternalAttributeVariable (f) != null){
			dc.append("const string " +GeneratorHelper.getExternalAttributeVariable (f) + " = \"" + f.getExternalFile().get(0).getAttribute() + "\"  \n") ;			
		}
		
		if( GeneratorHelper.getExternalLinkAttributeVariable (f) != null){
			dc.append("const string " +GeneratorHelper.getExternalLinkAttributeVariable (f) + " = \"" + f.getExtLinkFile().get(0).getAttribute() + "\"  \n") ;			
		}
		*/
		
		return dc.toString();
	}
	
	private static String getModuleFileName(Module m){
		String moduleFileName = null;
		
		if( (m.getFileName() != null) && (m.getFileName().length() > 0 ) ){
			
			moduleFileName = m.getFileName();
		
		}else{
			String moduleName = m.getName();
			int l = moduleName.length();
			char c = moduleName.charAt(l-1);
			
			if (c == 'y'){
				moduleFileName = StringUtil.getToFirstUpper(moduleName.substring(0,l-1)) + "ies";
			}else{
				moduleFileName =  StringUtil.getToFirstUpper(moduleName) + "s";
			}
		}
		
		return moduleFileName;
		
	}

}
