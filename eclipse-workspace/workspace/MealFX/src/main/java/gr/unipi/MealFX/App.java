//Class "App" belongs to package "gr.unipi.MealFX"
package gr.unipi.MealFX;

//Import of necessary JavaFX and utility classes
import java.util.ArrayList;      //Creation of resizable array lists
import java.util.List;           //Usage of the List interface
import javafx.application.Application; //Base class for JavaFX applications
import javafx.scene.Scene;       //Representation of a scene in a Stage
import javafx.stage.Stage;       //Representation of the top-level window
import model.MealInfo;           //Import of the MealInfo model class

//Class "App" for application implementation
public class App extends Application 
{
    //The application primary stage (main window)
    static Stage primaryStage;

    //Main Scene and Meal Scene
    static Scene mainScene, mealScene;

    //Static lists for favourite and cooked meals storage
    static List<MealInfo> FavMealList = new ArrayList<>();
    static List<MealInfo> CoMealList = new ArrayList<>();

    //Overriding of the start method called by JavaFX when overriding launched by the application
    @Override
    public void start(Stage Stage) 
    {
        //Creation of primary stage
        App.primaryStage = Stage;

        //Creation of Main Scene
        MainSceneCreator mainSceneCreator = new MainSceneCreator();
        mainScene = mainSceneCreator.createScene();

        //Creation of Meal Scene
        MealSceneCreator mealSceneCreator = new MealSceneCreator();
        mealScene = mealSceneCreator.createScene();

        //Setting of the primary stage title
        primaryStage.setTitle("MainFX Window");

        //Initialization of main scene
        primaryStage.setScene(mainScene);

        //Presentation of primary stage
        primaryStage.show();
    }

    //Main method for launching of the JavaFX application
    public static void main(String[] args) 
    {
        launch();
    }
}


