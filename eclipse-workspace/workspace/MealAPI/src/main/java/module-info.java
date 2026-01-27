//Declaration of module "gr.unipi.MealAPI"
module gr.unipi.MealAPI 
{
	
    //Exportation of the package "model" so that other modules can use its public classes
    exports model;

    //Exportation of the package "model.themealdb" for external access
    exports model.themealdb;

    //Exportation of the package "service" to provide API services to other modules
    exports service;

    //Exportation of the package "exception" to allow external modules to handle custom exceptions
    exports exception;

    //Requirement of Apache HttpClient for making HTTP requests to the Meal API
    requires org.apache.httpcomponents.httpclient;

    //Requirement of Apache HttpCore for low-level HTTP operations
    requires org.apache.httpcomponents.httpcore;

    //Requirement of Jackson Annotations for JSON serialization/deserialization annotations
    requires com.fasterxml.jackson.annotation;

    //Requirement of Jackson Core for JSON processing
    requires com.fasterxml.jackson.core;

    //Requirement of Jackson Databind for converting JSON to Java objects and vice versa
    requires com.fasterxml.jackson.databind;

    //Opening of the package "model.themealdb" specifically to Jackson Databind for reflection-based JSON processing
    opens model.themealdb to com.fasterxml.jackson.databind;
}
