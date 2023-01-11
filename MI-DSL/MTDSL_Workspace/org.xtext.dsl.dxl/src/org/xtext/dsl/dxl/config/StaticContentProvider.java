package org.xtext.dsl.dxl.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;



public class StaticContentProvider {
	
	public static String getContentFromStaticFile(String fileName){	
		String content;
		
		//InputStream i = new ByteArrayInputStream("Test String".getBytes());
		InputStream is = ( new StaticContentProvider()).getClass().getResourceAsStream(fileName);
		
		
		content = convertToStr(is);				
		//System.out.println(content);		
		
		
		return content;
		
	}
	
	

	/*
	 * Convert content of an input stream to string
	 */
	public static String convertToStr(InputStream is){
		final char[] buffer = new char[0x10000]; 
		StringBuilder out = new StringBuilder(); 
		//Reader in = new InputStreamReader(is, "UTF-8"); 
		Reader in = new InputStreamReader(is); 
		try { 
		  int read; 
		  
		  do { 
		    read = in.read(buffer, 0, buffer.length); 
		    if (read>0) { 
		      out.append(buffer, 0, read); 
		    } 
		  } while (read>=0); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
		  try {
			in.close();
		  } catch (IOException e) {			
		  } 
		} 
		String result = out.toString(); 
		
		return result;
		
	}
	
	

}


