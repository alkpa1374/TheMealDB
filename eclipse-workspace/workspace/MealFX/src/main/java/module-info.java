//Declaration of module "gr.unipi.MealFX"
module gr.unipi.MealFX 
{

    //Exportation of package "gr.unipi.MealFX" for public classes access by other modules
    exports gr.unipi.MealFX;

    //Requirement of module "gr.unipi.MealAPI" for its classes and services usage
    requires gr.unipi.MealAPI;

    //Requirement of module "JavaFX base" for core JavaFX functionality
    requires javafx.base;

    //Requirement of module "JavaFX controls" to use UI controls like Button, TableView, Label, etc.
    requires javafx.controls;

    //Requirement of module JavaFX graphics for scenes and UI elements rendering
    requires transitive javafx.graphics;

    //Requirement of Jackson Databind library for JSON serialization/deserialization
    requires com.fasterxml.jackson.databind;
    
    //requires junit;

}


