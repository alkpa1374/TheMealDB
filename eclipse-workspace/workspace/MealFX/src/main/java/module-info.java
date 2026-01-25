//Declare a module named "gr.unipi.MealFX"
module gr.unipi.MealFX {

    //Export the package "gr.unipi.MealFX" so that other modules can access its public classes
    exports gr.unipi.MealFX;

    //Require the "gr.unipi.MealAPI" module to use its classes and services
    requires gr.unipi.MealAPI;

    //Require JavaFX base module for core JavaFX functionality
    requires javafx.base;

    //Require JavaFX controls module to use UI controls like Button, TableView, Label, etc.
    requires javafx.controls;

    //Require JavaFX graphics module (transitively) for rendering scenes and UI elements
    requires transitive javafx.graphics;

    //Require Jackson Databind library for JSON serialization/deserialization
    requires com.fasterxml.jackson.databind;
    
//    requires junit;
}