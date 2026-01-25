//Declare a module named "gr.unipi.MealAPI"
module gr.unipi.MealAPI 
{
	
    //Export the "model" package so that other modules can use its public classes
    exports model;

    //Export the "model.themealdb" package for external access
    exports model.themealdb;

    //Export the "service" package to provide API services to other modules
    exports service;

    //Export the "exception" package to allow external modules to handle custom exceptions
    exports exception;

    //Require Apache HttpClient for making HTTP requests to the Meal API
    requires org.apache.httpcomponents.httpclient;

    //Require Apache HttpCore for low-level HTTP operations
    requires org.apache.httpcomponents.httpcore;

    //Require Jackson Annotations for JSON serialization/deserialization annotations
    requires com.fasterxml.jackson.annotation;

    //Require Jackson Core for core JSON processing
    requires com.fasterxml.jackson.core;

    //Require Jackson Databind for converting JSON to Java objects and vice versa
    requires com.fasterxml.jackson.databind;

    //Open the "model.themealdb" package specifically to Jackson Databind for reflection-based JSON processing
    opens model.themealdb to com.fasterxml.jackson.databind;
}
