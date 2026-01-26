//Declare a module named "gr.unipi.MealFX"
module gr.unipi.MealFX 
{

    //Exportation of package «gr.unipi.MealFX» so that other modules can access its public classes
    exports gr.unipi.MealFX;

    //Requirements of module «gr.unipi.MealAPI» to use its classes and services
    requires gr.unipi.MealAPI;

    //Requirements of module «JavaFX base» for core JavaFX functionality
    requires javafx.base;

    //Requirements of module «JavaFX controls» to use UI controls like Button, TableView, Label, etc.
    requires javafx.controls;

    //Requirements of module JavaFX graphics for rendering scenes and UI elements
    requires transitive javafx.graphics;

    //Requirements of Jackson Databind library for JSON serialization/deserialization
    requires com.fasterxml.jackson.databind;
    
    //requires junit;

}

