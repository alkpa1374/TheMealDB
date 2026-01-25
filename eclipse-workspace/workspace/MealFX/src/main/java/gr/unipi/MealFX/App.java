//Declare the package for this class
package gr.unipi.MealFX;

//Import necessary JavaFX and utility classes
import java.util.ArrayList;      //To create resizable array lists
import java.util.List;           //To use the List interface
import javafx.application.Application; //Base class for JavaFX applications
import javafx.scene.Scene;       //Represents a scene in a Stage
import javafx.stage.Stage;       //Represents the top-level window
import model.MealInfo;           //Import the MealInfo model class

//Main application class that extends JavaFX Application
public class App extends Application 
{
    //The primary stage (main window) of the application
    static Stage primaryStage;

    //Scenes for main window and meal window
    static Scene mainScene, mealScene;

    //Static lists to store favourite and cooked meals
    static List<MealInfo> FavMealList = new ArrayList<>();
    static List<MealInfo> CoMealList = new ArrayList<>();

    //Override the start method called by JavaFX when the application launches
    @Override
    public void start(Stage Stage) 
    {
        //Assign the provided stage to the static primaryStage variable
        App.primaryStage = Stage;

        //Create the main scene using the MainSceneCreator class
        MainSceneCreator mainSceneCreator = new MainSceneCreator();
        mainScene = mainSceneCreator.createScene();

        //Create the meal scene using the MealSceneCreator class
        MealSceneCreator mealSceneCreator = new MealSceneCreator();
        mealScene = mealSceneCreator.createScene();

        //Set the window title for the primary stage
        primaryStage.setTitle("MainFX Window");

        //Set the initial scene to the main scene
        primaryStage.setScene(mainScene);

        //Show the primary stage (make the window visible)
        primaryStage.show();
    }

    //Main method to launch the JavaFX application
    public static void main(String[] args) 
    {
        //Launch the JavaFX runtime and application
        launch();
    }
}
