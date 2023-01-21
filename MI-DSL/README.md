# MI-DXL Folder
Includes all the files of the Xtext-based Model Import Domain Specific Language(MI-DSL) editor for the Eclipse environment. This editor creates DXL libraries based on the description provided in the form of MT-DSL classes. You can down load and install the project as a plugin in Eclipse IDE.  The compact version of the editor is provided in the MI-DXL.rar archive.
# How to install
Please follow the instructions below.

## Requirements
- Eclipse Modeling Tools [download]( https://www.eclipse.org/) 
- Download the latest Xtext plugin [Instructions](https://www.eclipse.org/Xtext/download.html)

## Instructions
- Clone or download  the master branch of the repository.
- Open Eclipse
- Use `File` > `Open Projets from File System`
- to select the directory, go to the \MI-DXL\MTDSL_Workspace 
- Import each of these three cloned directories into the Eclipse workspace as shown in the following figure. 

1- `org.xtext.dsl.dxl` 
2- `org.xtext.dsl.dxl.tests`
3- `org.xtext.dsl.dxl.ui`

![alt text](https://github.com/Smart-Contract-Modelling-uOttawa/Traceability/blob/main/OpenXtextProject.png "Open project")

- In the `Package Explorer` panel, right click on the `org.xtext.dsl.dxl` directory, then click on `Run as` > `Eclipse Application`
  

#How to use
- In the new opened Eclipse window create a new project then create a new file with `.dxldsl` extension. 





# [Tutorial Folder](Tutorial/)
Contains a tutorial showing how to create classes and create the corresponding DXL library is supplied in [Report(XinyuZhao)](Tutorial/Report(XinyuZhao).pdf) and the related models and results. 
