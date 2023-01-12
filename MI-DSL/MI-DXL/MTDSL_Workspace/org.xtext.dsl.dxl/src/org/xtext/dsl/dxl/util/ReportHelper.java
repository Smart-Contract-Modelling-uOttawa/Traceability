package org.xtext.dsl.dxl.util;

import org.xtext.dsl.dxl.config.StaticContentProvider;
import org.xtext.dsl.dxl.dxlDsl.Module;


public class ReportHelper {
	
	
	public void generateLibForReport(){			
		
	}
	
	public static String createDynamicContentForReprot(String folderContents){
		
		StringBuffer dc = new StringBuffer();
		
		//adding comment for DXL method
		dc.append("/***************************************************************************************\n");
		dc.append("// Author Anisur Rahman\n"); 
		dc.append("// based on Gunter Mussbacher, May-Jun2005\n");
		dc.append("// - generates change report for all UCM modules\n");
		dc.append("// - only called from within a module\n");
		dc.append("// - assumptions for this function\n");
		dc.append("//			- all external modules with links to UCM modules are open (otherwise suspect links will not be detected)\n");
		dc.append("//			- internal links do not cause suspect links for UCM objects because UCM modules are not supposed to be changed by a DOORS user\n");
		dc.append("// 			- halts if initialization checks (beginGenerateChangeReport) fail, otherwise always returns true\n");
		dc.append("*/\n");
		
		dc.append("bool generateChangeReport() {\n");
		dc.append("\tbeginGenerateChangeReport()\n");
		
		dc.append(folderContents);
		
		dc.append("\tendGenerateChangeReport()\n");
		dc.append("\treturn true\n");
		dc.append("}\n");
		
		
		return dc.toString();
	}
	
	
	public static String createContentForFolder(org.xtext.dsl.dxl.dxlDsl.Folder f){
		StringBuffer dc = new StringBuffer();
	
		for (Module m:f.getModule()){
			
			if (!m.isIgnoreInReport() ){
				String moduleName = m.getName() + "Module";
				dc.append("\tgenerateModuleChangeReport( " + moduleName  + " )\n") ;
			}
			
			//    "generateModuleChangeReport( deviceModule )"
		}		
		
		return dc.toString();
	}
	
	public static void createReportFile(){		
		StaticContentProvider p = new StaticContentProvider();		
		String fileName = p.getClass().getResource("ReportStatic.dxl").toString() ;		
	}
	
	
	
	public static void showTestContent(String s){
		System.out.println(s);
	}
	

	

}
