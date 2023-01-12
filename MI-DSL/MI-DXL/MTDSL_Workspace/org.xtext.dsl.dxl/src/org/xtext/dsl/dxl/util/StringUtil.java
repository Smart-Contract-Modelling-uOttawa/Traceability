package org.xtext.dsl.dxl.util;

public class StringUtil {
	
	public static String getVarName(String str){
		
		return str.replaceAll(" ", "_");
	}
	
	public static String getToFirstLower(String str){
		
		if (str == null) {
			return null;
		}
		
		String result  = "";
		
		if (str.length() > 0){
			result = str.substring(0,1).toLowerCase();
			
			if (str.length() > 1 ){
				result += str.substring(1);
			}	
		}		
		
		return result;
		
	}
	
	public static String getToFirstUpper(String str){
		
		if (str == null) {
			return null;
		}
		
		String result  = "";
		
		if (str.length() > 0){
			result = str.substring(0,1).toUpperCase();
			
			if (str.length() > 1 ){
				result += str.substring(1);
			}	
		}		
		
		return result;
		
	}

}
