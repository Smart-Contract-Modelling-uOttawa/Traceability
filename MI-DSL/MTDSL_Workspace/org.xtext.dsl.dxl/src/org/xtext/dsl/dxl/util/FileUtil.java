package org.xtext.dsl.dxl.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileUtil {	
		

	
	 static public String getFileContents(File file) {
		   
		    StringBuffer contents = new StringBuffer();
		    
		    try {

		      BufferedReader input =  new BufferedReader(new FileReader(file));
		      try {
		        String line = null; 
		        
		        
		        while (( line = input.readLine()) != null){
		          contents.append(line);
		          //contents.append(System.getProperty("line.separator"));
		          contents.append("\n");
		        }
		      }
		      finally {
		        input.close();
		      }
		    }
		    catch (IOException ex){
		      ex.printStackTrace();
		    }
		    
		    return contents.toString();
		  }


}
