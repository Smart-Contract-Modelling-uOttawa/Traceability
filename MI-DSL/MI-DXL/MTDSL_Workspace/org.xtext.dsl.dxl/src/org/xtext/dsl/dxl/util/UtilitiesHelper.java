package org.xtext.dsl.dxl.util;

import java.util.ArrayList;

import org.xtext.dsl.dxl.dxlDsl.Module;

public  class UtilitiesHelper {
	
	public static final String OUTPUT_LOCATION = "/output/" ;
	public static final String DOORS_LIB_LOCATION = "addins/DSL/lib/";
	public static final String UTILITY_FILE_NAME = "Utilities.dxl";
	public static final String REPORT_FILE_NAME = "Report.dxl" ;
	public static final String LINK_FILE_NAME = "Links.dxl";
	public static final String GLOBAL_FILE_NAME = "Global.dxl";
	public static final String IMPORT_FILE_NAME = "Import.dxl";
	public static final String INITEXIT_FILE_NAME = "InitExit.dxl";	
	public static final String MODULEUTILITIES_FILE_NAME = "ModuleUtilities.dxl";
	
	private static ListHelper fileList = new ListHelper();
	
	public static void initialize(){
		fileList.clearList();
	}
	
	
	public static void addFileToList(String fileName){
		fileList.addToList(fileName);
		
	}
	
	public static String getLibFileNameForModule(Module m){
		return StringUtil.getToFirstUpper(m.getName()) + ".dxl" ;
	}
	
	
	public static String getUtilityFileContents(){
		
		StringBuffer dc = new StringBuffer();
		dc.append("\n\n");
		
		String fileComment = "/***************************************************************************************\n" 
				+ "// Generated version\n"
				+ "// Author Anisur Rahman, Aug 2012\n"
				+ "// Based on version by Gunter Mussbacher & initial version by Bo Jiang\n"
				+ "*/\n" ;
			
		
		dc.append(fileComment + "\n");
		
		for(String fileName:fileList.getList()){
			
			dc.append("#include \"" +  DOORS_LIB_LOCATION + fileName  +   "\"\n");
		}
		
		
		dc.append("\n");
		return dc.toString();
		
	}
	
	
	
	
	private static class ListHelper{		
		
		private  ArrayList<String> list= new ArrayList<String>();
		
		public  void addToList(String listItem){
			list.add(listItem);
		}

		public  ArrayList<String> getList() {
			return list;
		}
		
		public void clearList(){		
			list.clear();		
		}
		
	}

}
