//Declaration of module «gr.unipi.MealAPI»
module gr.unipi.MealAPI 
{
	
    //Exportation of the package «model» so that other modules can use its public classes
    exports model;

    //Exportation of the package «model.themealdb» package for external access
    exports model.themealdb;

    //Exportation of the package «service» package to provide API services to other modules
    exports service;

    //Exportation of the package «exception» package to allow external modules to handle custom exceptions
    exports exception;

    //Requirements of Apache HttpClient for making HTTP requests to the Meal API
    requires org.apache.httpcomponents.httpclient;

    //Requirements of Apache HttpCore for low-level HTTP operations
    requires org.apache.httpcomponents.httpcore;

    //Requirements of Jackson Annotations for JSON serialization/deserialization annotations
    requires com.fasterxml.jackson.annotation;

    //Requirement of Jackson Core for core JSON processing
    requires com.fasterxml.jackson.core;

    //Requirement of Jackson Databind for converting JSON to Java objects and vice versa
    requires com.fasterxml.jackson.databind;

    //Opening of the package «model.themealdb» specifically to Jackson Databind for reflection-based JSON processing
    opens model.themealdb to com.fasterxml.jackson.databind;
}
