# Traceability
This contains two parts:

## 1- [MI-DXL Editor](MI-DSL/)
This xtext editor contributes a reliable mechanism to define and support traceability between requirements and models such as GRL, Feature, SysML,.,etc. To use it, you need to write the model traceability descriptions written using MT-DSL classes describing your model inside this editor. A library for importing and maintaining the described model will be created automatically from your classes once they are saved by the editor. This library is created for one time and used to import and reimport the described models. The target language for this library is the DOORS eXtension Language (DXL), the scripting language of a leading commercial RMS with traceability support, namely IBM Rational DOORS. A model in some modeling tools can be converted automatically to a DXL script, which when run invokes the functions of the DXL library and imports (or re-imports) the model to the DOORS RMS. 

This xText editor is exploited by CGS4Adaptation Approach to generate DXL library for SysML BDD and requirements diagram to be installed in the DOORS database. 

## 2- [CGS4Adaptation Approach](CGS4Adaptation/)
This approach combines two types of models, GRL and SysML models to support self-adaptive SCPSs in their development process and in their run-time adaptation activities when expected and unexpected changes are encountered. This part support easy to manage traceability between GRL and SysML models. Here, we provide a way to convert GRL and SysML models automatically to a DXL script, which when run invokes the functions of the DXL library and imports (or re-imports) the model to the DOORS RMS
