package org.xtext.dsl.dxl.util;

import org.xtext.dsl.dxl.dxlDsl.Association;
import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.Attribute;
import org.xtext.dsl.dxl.dxlDsl.Folder;
import org.xtext.dsl.dxl.dxlDsl.Module;


public class GeneratorHelper {
	
	public static String createFileVariableForImage(org.xtext.dsl.dxl.dxlDsl.Module m,org.xtext.dsl.dxl.dxlDsl.Class c ){
		String varStr = "";
		
		
		if (m.getName() != null && m.getName().equalsIgnoreCase( c.getName())){
			
			for (Attribute f: c.getAttributes()  ){							
				
				if (f.getType().equalsIgnoreCase( "diagram")) {
					//currentMapObject
					String varName = "current" + StringUtil.getToFirstUpper( m.getName()) + "Object";
					
					//Object currentMapObject
					varStr += "Object " + varName ;
					
				}				
				
			}
			
		}
		
		return varStr;		
	}
	
	
	public static String declareLastVariableForImage(org.xtext.dsl.dxl.dxlDsl.Module m,org.xtext.dsl.dxl.dxlDsl.Class c ){
		String varStr = "";
		
		
		if (m.getName() != null && m.getName().equalsIgnoreCase( c.getName())){
			
			for (Attribute f: c.getAttributes()  ){
							
				
				if (f.getType().equalsIgnoreCase( "diagram")) {
					//currentMapObject
					String varName = "last" + StringUtil.getToFirstUpper( m.getName()) + "Object";
					
					//Object currentMapObject
					varStr += ", " + varName ;					
				}				
			}
			
		}
		
		return varStr;
		
	}
	
	public static String declareLocalVariableForIntAttribute(org.xtext.dsl.dxl.dxlDsl.Module m,org.xtext.dsl.dxl.dxlDsl.Class c ){
		String varStr = "";
		
		//if ((!isClassContainImage (c)) && isModuleContainImage(m)){				
		//	varStr += "int i " ;
		//}
		
		if (isClassContainInt(c)){	
			
			varStr += "int i " ;	
		}
		
		
		return varStr;
		
	}
	
	public static String getDefaultforObjectNotFound(org.xtext.dsl.dxl.dxlDsl.Module m, org.xtext.dsl.dxl.dxlDsl.Class c ){
		
		String varStr = "";
		
		if (isClassContainImage (c)){
			
			varStr += "// cannot assume that the current module is  " +  m.getName() + "Module, needs to be set explicitly\n";
			varStr += "current = " +  m.getName() + "Module\n";
			varStr += "// the picture needs to be inserted first, if another attribute is assigned before\n";
			varStr += "// that the picture cannot be added anymore\n";
			varStr += "if( null( last " + m.getName() + "Module ) ) \n";
			varStr += "	insertPictureFileAfter( "+ getImageParameterForClass(c) +", formatBMP, null )\n";
			varStr += "else { \n";
			varStr += "  " + getLastVariableForImageFile(m) + " = findAncestorOfType( \"" 
						+ ((c.getClassTypeDescription() == null || c.getClassTypeDescription().length() == 0) ? c.getName()  : c.getClassTypeDescription())
						+ "\", last " + m.getName() + "Module )\n";
			varStr += "	insertPictureFileAfter( "+ getImageParameterForClass(c) +", formatBMP, " + getLastVariableForImageFile(m) + " )\n";
			varStr += "}\n";
			varStr += "foundObject = last " + m.getName() + "Module\n ";					
			
			
		
		} else if (isModuleContainImage(m)){
			varStr += "// cannot assume that the current module is " +  m.getName() + "Module, needs to be set explicitly\n";
			varStr += "current = " +  m.getName() + "Module\n";
			varStr += "foundObject = create last below current" +  StringUtil.getToFirstUpper(m.getName()) + "Object";
			
		}else{
			
			varStr += "foundObject = createNewObject(" + m.getName() + "Module ) \n";			
		}
		
		return varStr;
		
	}
	
	
	public static String getInsertImageStrForObjectFound(org.xtext.dsl.dxl.dxlDsl.Module m, org.xtext.dsl.dxl.dxlDsl.Class c ){
		
		String varStr = "";
		
		if (isClassContainImage (c)){
			
			
			varStr += "	insertPictureFile( "+ getImageParameterForClass(c) +", formatBMP, " + "foundObject" + " )\n";
							
			
		}else{
			
					
		}
		
		return varStr;
		
	}
	
	
	
	public static String getSetDefaultObjectForImage(org.xtext.dsl.dxl.dxlDsl.Module m, org.xtext.dsl.dxl.dxlDsl.Class c ){
		
		String varStr = "";
		
		if (isClassContainImage (c)){
			
			//currentMapObject = foundObject
			
			varStr += getFileVariableForImageFile(m) +" = foundObject \n";
							
			
		}else{
			
					
		}
		
		return varStr;
		
	}
	
	
	public static String getStrForSetNameForObjectNotFound(org.xtext.dsl.dxl.dxlDsl.Module m, org.xtext.dsl.dxl.dxlDsl.Class c ){
		
		String varStr = "";		
		if ((!isClassContainImage (c)) && isModuleContainImage(m)){			
			varStr += "foundObject.\"Object Heading\" = " + getFileVariableForImageFile(m) + ".\"Name_\" \".\" name\n";
			varStr += "foundObject.\"Name_\" = name"	;			
		}else{
			varStr += "foundObject.\"Object Heading\" = " + StringUtil.getToFirstLower( c.getName()) + "Name\n";
			varStr += "foundObject.\"Name_\" = " + StringUtil.getToFirstLower( c.getName()) + "Name"	;			
		}
		
		if(isModuleContainImage (m)||isModuleContainAssociation(m)){
			/*
			 * Don't find an easy way to know the Class type in the run time DXL code. Need to use an DOORS attribute to hold this value. 
			 * "Type" has been used in existing jUCMNav DOORS integration.
			 * 
			 */
			 
						
			// Commenting following; as it is more likely to have a "Type" as an attribute. Using "ObjectType_" instead to store the name of the Class. 
			
			//if(!isClassContainsTypeInArgument(c)){
			//	
			//	varStr += "\nfoundObject.\"Type\" = " 
			//			+ "\""
			//			+ ((c.getClassTypeDescription() == null || c.getClassTypeDescription().length() == 0) ? StringUtil.getToFirstLower(c.getName())  : c.getClassTypeDescription())
			//			+"\"";				
			//}
			
			if(!isClassContainsObjectTypeUnderscoreInArgument(c)){
				
				varStr += "\nfoundObject.\"ObjectType_\" = " 
						+ "\""
						+  c.getName() 
						+"\"";				
			}
			
				
		}
		
		return varStr;
		
	}
	
	
	public static String getStrForSetNameForObjectFound(org.xtext.dsl.dxl.dxlDsl.Module m, org.xtext.dsl.dxl.dxlDsl.Class c ){		
		
		String varStr = "";		
		if ((!isClassContainImage (c)) && isModuleContainImage(m)){			
			
			varStr += "if( foundObject.\"Object Heading\" \"\" != " + getFileVariableForImageFile(m) + ".\"Name_\" \".\" name ) {\n";
			varStr += "\t foundObject.\"Object Heading\" = " + getFileVariableForImageFile(m) + ".\"Name_\" \".\" name\n";
			varStr += "}\n";
			varStr += "if( foundObject.\"Name_\" \"\" != name ) {\n";
			varStr += "\t foundObject.\"Name_\" = name\n";
			varStr += "}\n";
			
			varStr += "if( parent( foundObject ) != " + getFileVariableForImageFile(m) + " ) {\n";
			varStr += "\t	move( foundObject, below " + getFileVariableForImageFile(m) + " )\n";
			varStr += "}";
			
			
		}else{			
			varStr += "if( foundObject.\"Name_\" \"\" != " + StringUtil.getToFirstLower( c.getName()) + "Name ) {\n";
			varStr += "\t foundObject.\"Object Heading\" = " + StringUtil.getToFirstLower( c.getName()) + "Name\n";
			varStr += "\t foundObject.\"Name_\" = " + StringUtil.getToFirstLower( c.getName()) + "Name \n";   
			varStr += "}";
			
		}
		
		return varStr;
		
	}
	
	
	
	public static String getImageParameterForClass(org.xtext.dsl.dxl.dxlDsl.Class c ){
		
		for (Attribute f: c.getAttributes()  ){			
			
			if (f.getType().equalsIgnoreCase( "diagram")) {
				return StringUtil.getToFirstLower(c.getName()) +  StringUtil.getVarName (StringUtil.getToFirstUpper( f.getName())) ;				
			}				
		}
		
		return "";
		
	}
	
	
	public static boolean isModuleContainImage(org.xtext.dsl.dxl.dxlDsl.Module m ){			
		for ( org.xtext.dsl.dxl.dxlDsl.Class c: m.getClasses() ){			
			for (Attribute f: c.getAttributes()  ){				
				if (f.getType().equalsIgnoreCase( "diagram")) {
					return true;					
				}				
			}			
		}		
		return false;		
	}
	
	
	
	public static boolean isClassContainsTypeInArgument(org.xtext.dsl.dxl.dxlDsl.Class c ){			
					
			for (Attribute f: c.getAttributes()  ){			
				String str = (f.getDefault() == null) ? f.getName() :  f.getDefault() ;
				if ("Type".equalsIgnoreCase(str)) {
					return true;					
				}				
			}			
			
		return false;		
	}
	
	public static boolean isClassContainsObjectTypeUnderscoreInArgument(org.xtext.dsl.dxl.dxlDsl.Class c ){			
		
		for (Attribute f: c.getAttributes()  ){			
			String str = (f.getDefault() == null) ? f.getName() :  f.getDefault() ;
			if ("ObjectType_".equalsIgnoreCase(str)) {
				return true;					
			}				
		}			
		
	return false;		
	}

	
	public static boolean isClassContainImage(org.xtext.dsl.dxl.dxlDsl.Class c ){						
			for (Attribute f: c.getAttributes()  ){				
				if (f.getType().equalsIgnoreCase( "diagram")) {
					return true;					
				}				
			}					
		return false;		
	}
	
	
	public static boolean isModuleContainAssociation(org.xtext.dsl.dxl.dxlDsl.Module m ){			
		for ( org.xtext.dsl.dxl.dxlDsl.Class c: m.getClasses() ){			
				if (isClassContainAssociation(c)){
					return true;
				}
		}		
		return false;		
	}
	
	public static AssociationType getFirstAssociationTypeForClass(org.xtext.dsl.dxl.dxlDsl.Class c){			
		for (Association a: c.getAssociations() ){			
				AssociationType at = a.getAssoType();		
				return at;
		}		
		return null;		
	}
	
	public static boolean isClassContainAssociation(org.xtext.dsl.dxl.dxlDsl.Class c ){						
		for (@SuppressWarnings("unused") Association f: c.getAssociations() ){			
			return true;							
		}			
		return false;		
	}

	
	public static boolean isClassContainInt(org.xtext.dsl.dxl.dxlDsl.Class c ){						
			for (Attribute f: c.getAttributes()  ){				
				if (f.getType().equalsIgnoreCase( "int")) {
					return true;					
				}				
			}					
		return false;		
	}
	
	
	
	public static String getFileVariableForImageFile(org.xtext.dsl.dxl.dxlDsl.Module m){
		String varName = "current" + StringUtil.getToFirstUpper( m.getName()) + "Object";					
		return varName;
		
	}
	 
	public static String getLastVariableForImageFile(org.xtext.dsl.dxl.dxlDsl.Module m){
		String varName = "last" + StringUtil.getToFirstUpper( m.getName()) + "Object";					
		return varName;
		
	}
	

	
	public static String getArgumentListForAttributes(org.xtext.dsl.dxl.dxlDsl.Module m, org.xtext.dsl.dxl.dxlDsl.Class c){
		
		StringBuffer argumentStr = new StringBuffer();
		
		String classNameFirstLower = StringUtil.getToFirstLower( c.getName());	
		//String classNameFirstUpper = StringUtil.getToFirstUpper( e.getName());
		
		//variable to keep track number of variables
		int count = 0;
		
		argumentStr.append("string " + classNameFirstLower + "ID" );
		count++;
		
		if ((!isClassContainImage (c)) && isModuleContainImage(m)){
			argumentStr.append(", string " +  "name");
			count++;
		}else{
			argumentStr.append(", string " + classNameFirstLower + "Name");
			count++;
		}
		
		if(!c.isNoDescription()){
			argumentStr.append(", string " + classNameFirstLower + "Description");
			count++;
		}		
		
		for (Attribute f: c.getAttributes()  ){
			argumentStr.append(", ");
			
			if (count % 4 == 0){
				argumentStr.append("\n\t");				
			}
			
			argumentStr.append( 
	//				(f.getType().equalsIgnoreCase( "diagram")? "string" 
	//						: (	f.getType().equalsIgnoreCase( "Integer")? "int" : f.getType()))
					(f.getType().equalsIgnoreCase( "diagram")? "string" :  f.getType())
					+ " " 
					+ classNameFirstLower + StringUtil.getVarName(StringUtil.getToFirstUpper(f.getName())));
			
			count++;
		}
		return argumentStr.toString();	
		
	}
	
	public static String getLinkFileVariable(AssociationType at){
		return "fileNameLink" + StringUtil.getToFirstUpper(at.getName());
	}
	
	public static String getModuleFlieVariable(Module m){
		String fileVariableName = "";
		String moduleName = m.getName();
		int l = moduleName.length();
		char c = moduleName.charAt(l-1);
		
		if (c == 'y'){
			fileVariableName = "fileName" + StringUtil.getToFirstUpper(moduleName.substring(0,l-1)) + "ies";
		}else{
			fileVariableName = "fileName" + StringUtil.getToFirstUpper(moduleName) + "s";
		}
		
		
		return fileVariableName;
	}
	
	/*
	public static String getExternalFileVariable(Folder f){
		
		if((f.getExternalFile() != null) && (f.getExternalFile().size() > 0 ) ){
		
			//ExternalFile file = f.getExternalFile().get(0);
			
			return "fileNameExternal";
		
		}
		
		return null;
	}
	
	public static String getExternalLinkFileVariable(Folder f){
		
		if((f.getExtLinkFile() != null) && (f.getExtLinkFile().size() > 0 ) ){
		
			//ExternalLinkFile file = f.getExtLinkFile().get(0);
			
			return "fileNameLinkExternal";
		
		}
		
		return null;
	}
	

	public static String getExternalAttributeVariable(Folder f){
		
		if((f.getExternalFile() != null) && (f.getExternalFile().size() > 0 ) ){
		
			//ExternalFile file = f.getExternalFile().get(0);
			
			return "attributeExternalModule";
		
		}
		
		return null;
	}
	
	public static String getExternalLinkAttributeVariable(Folder f){
		
		if((f.getExtLinkFile() != null) && (f.getExtLinkFile().size() > 0 ) ){
		
			//ExternalLinkFile file = f.getExtLinkFile().get(0);
			
			return "attributeExternalLinkModule";
		
		}
		
		return null;
	}
	
**/	
	
	
	/*
	  string «e.name.toFirstLower + "ID"»,  string «e.name.toFirstLower + "Name"», string «e.name.toFirstLower + "Description"»
	   «FOR f:e.attributes»
	   ,  «f.type»  «e.name.toFirstLower +  StringUtil::getVarName(f.name.toFirstUpper)»  
     «ENDFOR» 
	
	*/
	
	/*
	  string componenTest12ID,  string componenTest12Name, string componenTest12Description
	   ,  String  componenTest12Processor_Demand_And_OK_  
	   ,  Boolean  componenTest12Some_Thing_goes_here_too_  
	   ,  Text  componenTest12This_is_one  
	   ,  Text  componenTest12Another_On_Anisur  
	
	*/
	
	public static String getModuleVariableName(Module m){
		
		return m.getName() + "Module";
	}
	

	public static String getLinkModuleVariableName(AssociationType at){		
		
		return at.getName() + "Module";
	}
	
	
	
	public static String getFolderVariableName(Folder f){
		
		return f.getName();
	}
	
	
	
}
