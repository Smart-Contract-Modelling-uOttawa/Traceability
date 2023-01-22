# How to generate report from VTLTemplate
After writing the VTLTemplate (e.g., [VTLTemplate.txt](VTLTemplate.txt)), you need to connect this template to your model in Cameo Systems Modeler tool. 
The tool use 'report wizard' tool to do so. Here, we provide the steps for generating the DSL descriptions from diagrams' elements. 

## The input
[VTLTemplate.txt](VTLTemplate.txt): to be executed by Cameo Systems Modeler Demo SysMLtool to read the block and requirements diagrams and generate DXL report. 
The picture of the diagrams will be saved into 'Report_files folder'. The picture should be changed to .BMB files to be exported into DOORS.
## The output
Report: the output of the Cameo Systems Modeler Demo tools. the description of the block and requirements diagrams using DXL to be executed by DOORS' DXL 
and import the models into DOOORS.

## Steps

- On the Tools menu, click `Report Wizard`. The Report Wizard dialog will appear. Click on `New` to Create a new template
![alt text](https://github.com/Smart-Contract-Modelling-uOttawa/Traceability/blob/main/CGS4Adaptation/images/Step1.png "Report Wizar")
- A new screen will appear to write the name of the report and select the template that you wrote using VTLC language [VTLTemplate.txt]. 
  The template in the image is `smarthom.txt`
- Then click `Create`/ `Cr..`
   ![alt text](https://github.com/Smart-Contract-Modelling-uOttawa/Traceability/blob/main/CGS4Adaptation/images/Step2.png "Report Wizar")
   
- Click `Next`. On the next screen, click `Next` again. On the following screen, Click on the package (the package that hold your model including all your diagrams) you want to create the report from it.
   ![alt text](https://github.com/Smart-Contract-Modelling-uOttawa/Traceability/blob/main/CGS4Adaptation/images/Step6.5.png "Report Wizar")
-  Then click `Next`.
- On the following screen, write the name and select the location of the report that will be issued by the tool.
- Then click Generate.
- ![alt text](https://github.com/Smart-Contract-Modelling-uOttawa/Traceability/blob/main/CGS4Adaptation/images/Step7.png "Report Wizar")
- The report will be generated on the specified location and name.
 
