//Class «CookedSceneCreator» belongs package «gr.unipi.MealFX»
package gr.unipi.MealFX;

//Import of File class for representing files in the file system
import java.io.File;

//Import of IOException for handling input/output exceptions when working with files
import java.io.IOException;

//Import of ArrayList for dynamically-sized lists of objects
import java.util.ArrayList;

//Import of List interface for using lists as a collection type
import java.util.List;

//Import of exception class for JSON generation errors from Jackson library
import com.fasterxml.jackson.core.JsonGenerationException;

//Import of exception class for JSON mapping errors from Jackson library
import com.fasterxml.jackson.databind.JsonMappingException;

//Import of ObjectMapper from Jackson library to read and write JSON data
import com.fasterxml.jackson.databind.ObjectMapper;

//Import of SerializationFeature to configure formatting options for JSON output
import com.fasterxml.jackson.databind.SerializationFeature;

//Import of TypeFactory from Jackson library to construct complex collection types for JSON deserialization
import com.fasterxml.jackson.databind.type.TypeFactory;

//Import of custom exception class for handling Meal API related errors
import exception.MealAPIException;

//Import of ObservableList, a JavaFX collection that allows automatic updates in UI controls like TableView
import javafx.collections.ObservableList;

//Import of EventHandler interface to handle events such as mouse clicks
import javafx.event.EventHandler;

//Import of Pos enum to set alignment (e.g., CENTER) in JavaFX layout panes
import javafx.geometry.Pos;

//Import of Scene class to represent a container for all content in a JavaFX window
import javafx.scene.Scene;

//Import of Alert dialog class for showing pop-up messages to the user
import javafx.scene.control.Alert;

//Import of AlertType enum to specify the type of alert (e.g., INFORMATION, ERROR)
import javafx.scene.control.Alert.AlertType;

//Import of Button control to allow user interactions
import javafx.scene.control.Button;

//Import of Label control to display text in the UI
import javafx.scene.control.Label;

//Import of TableView control to display tabular data
import javafx.scene.control.TableView;

//Import of TableViewSelectionModel to handle selection operations within a TableView
import javafx.scene.control.TableView.TableViewSelectionModel;

//Import of TextField control for user input of single-line text
import javafx.scene.control.TextField;

//Import of PropertyValueFactory to map table columns to object properties for TableView
import javafx.scene.control.cell.PropertyValueFactory;

//Import of FlowPane layout for arranging UI elements horizontally or vertically
import javafx.scene.layout.FlowPane;

//Import of GridPane layout for arranging UI elements in a flexible grid of rows and columns
import javafx.scene.layout.GridPane;

//Import of Stage class to represent a top-level JavaFX window
import javafx.stage.Stage;

//Import of the MealInfo model representing a meal entity
import model.MealInfo;

//Import of service class for interacting with the Meal API
import service.MealAPIService;

//Import of MouseEvent class to handle mouse input events like clicks
import javafx.scene.input.MouseEvent;

//Import of TableColumn class to define columns in a TableView
import javafx.scene.control.TableColumn;

//Class «CookedSceneCreator» for meal scene implementation
public class CookedSceneCreator implements EventHandler<MouseEvent>
{
	 //Flow Pane
	 FlowPane buttonFlowPane;

	 //Grid Panes
	 GridPane rootGridPane, inputFieldsPane;

	 //Meal scene buttons
	Button deleteCookedBtn, moveMealBtn, getDetailsBtn, backBtn;
	
	//Label to display text in the meal scene
     Label textLbl = new Label("Parameter");

     //TextField for user input or parameters in the meal scene
     TextField paramField = new TextField();

     //TableView to display a list of MealInfo objects in a tabular form
     TableView<MealInfo> MealTableView;
	
	//Jackson ObjectMapper instances for JSON serialization/deserialization
     ObjectMapper mapper1 = new ObjectMapper();
     ObjectMapper mapper2 = new ObjectMapper();

	//Constructor for cooked scene creator
	public CookedSceneCreator() 
	{
		 //Creation of the root grid pane
        rootGridPane = new GridPane();

        //Creation of the input fields pane
        inputFieldsPane = new GridPane();

        //Creation of the button flow pane
        buttonFlowPane = new FlowPane();

        //Creation of buttons
		 deleteCookedBtn = new Button("Delete Cooked");
		 moveMealBtn = new Button("Move Meal");
		 getDetailsBtn = new Button("Get Details");
		 backBtn = new Button("Back");
		
		 //Initialize the TableView to display MealInfo objects
		 MealTableView = new TableView<MealInfo>();
		
		  //Creation of a TableColumn for the «idMeal» property
        TableColumn<MealInfo, String> idMealColumn = new TableColumn<>("idMeal");
        //Binding of the column to the «idMeal» property
        idMealColumn.setCellValueFactory(new PropertyValueFactory<>("idMeal"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(idMealColumn);

        //Creation of a TableColumn for the «strMeal» property
        TableColumn<MealInfo, String> strMealColumn = new TableColumn<>("strMeal");
        //Binding of the column to the «strMeal» property
        strMealColumn.setCellValueFactory(new PropertyValueFactory<>("strMeal"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strMealColumn);

        //Creation of a TableColumn for the «strMealAlternate» property
        TableColumn<MealInfo, String> strMealAlternateColumn = new TableColumn<>("strMealAlternate");
        //Binding of the column to the «strMealAlternate» property
        strMealAlternateColumn.setCellValueFactory(new PropertyValueFactory<>("strMealAlternate"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strMealAlternateColumn);

        //Creation of a TableColumn for the «strCategory» property
        TableColumn<MealInfo, String> strCategoryColumn = new TableColumn<>("strCategory");
        //Binding of the column to the «strCategory» property
        strCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("strCategory"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strCategoryColumn);

        //Creation of a TableColumn for the «strArea» property
        TableColumn<MealInfo, String> strAreaColumn = new TableColumn<>("strArea");
        //Binding of the column to the «strArea» property
        strAreaColumn.setCellValueFactory(new PropertyValueFactory<>("strArea"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strAreaColumn);

        //Creation of a TableColumn for the «strInstructions» property
        TableColumn<MealInfo, String> strInstructionsColumn = new TableColumn<>("strInstructions");
        //Binding of the column to the «strInstructions» property
        strInstructionsColumn.setCellValueFactory(new PropertyValueFactory<>("strInstructions"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strInstructionsColumn);

        //Creation of a TableColumn for the «strMealThumb» property (image URL)
        TableColumn<MealInfo, String> strMealThumbColumn = new TableColumn<>("strMealThumb");
        //Binding of the column to the «strMealThumb» property
        strMealThumbColumn.setCellValueFactory(new PropertyValueFactory<>("strMealThumb"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strMealThumbColumn);

        //Creation of a TableColumn for the «strTags» property
        TableColumn<MealInfo, String> strTagsColumn = new TableColumn<>("strTags");
        //Binding of the column to the «strTags» property
        strTagsColumn.setCellValueFactory(new PropertyValueFactory<>("strTags"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strTagsColumn);

        //Creation of a TableColumn for the «strYoutube» property (YouTube link)
        TableColumn<MealInfo, String> strYoutubeColumn = new TableColumn<>("strYoutube");
        //Binding of the column to the «strYoutube» property
        strYoutubeColumn.setCellValueFactory(new PropertyValueFactory<>("strYoutube"));
        //Add the column to the TableView
        MealTableView.getColumns().add(strYoutubeColumn);

        //Creation of a TableColumn for the «strIngredient1» of MealInfo
		TableColumn<MealInfo, String> strIngredient1Column = new TableColumn<>("strIngredient1");

		//Binding of the column to the «strIngredient1» property
		strIngredient1Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient1"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient1Column);

		//Creation of a TableColumn for the «strIngredient2» of MealInfo
		TableColumn<MealInfo, String> strIngredient2Column = new TableColumn<>("strIngredient2");

		//Binding of the column to the «strIngredient2» property
		strIngredient2Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient2"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient2Column);

		//Creation of a TableColumn for the «strIngredient3» of MealInfo
		TableColumn<MealInfo, String> strIngredient3Column = new TableColumn<>("strIngredient3");

		//Binding of the column to the «strIngredient3» property
		strIngredient3Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient3"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient3Column);

		//Creation of a TableColumn for the «strIngredient4» of MealInfo
		TableColumn<MealInfo, String> strIngredient4Column = new TableColumn<>("strIngredient4");

		//Binding of the column to the «strIngredient4» property
		strIngredient4Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient4"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient4Column);

		//Creation of a TableColumn for the «strIngredient5» of MealInfo
		TableColumn<MealInfo, String> strIngredient5Column = new TableColumn<>("strIngredient5");

		//Binding of the column to the «strIngredient5» property
		strIngredient5Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient5"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient5Column);

		//Creation of a TableColumn for the «strIngredient6» of MealInfo
		TableColumn<MealInfo, String> strIngredient6Column = new TableColumn<>("strIngredient6");

		//Binding of the column to the «strIngredient6» property
		strIngredient6Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient6"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient6Column);

		//Creation of a TableColumn for the «strIngredient7» of MealInfo
		TableColumn<MealInfo, String> strIngredient7Column = new TableColumn<>("strIngredient7");

		//Binding of the column to the «strIngredient7» property
		strIngredient7Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient7"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient7Column);

		//Creation of a TableColumn for the «strIngredient8» of MealInfo
		TableColumn<MealInfo, String> strIngredient8Column = new TableColumn<>("strIngredient8");

		//Binding of the column to the «strIngredient8» property
		strIngredient8Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient8"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient8Column);

		//Creation of a TableColumn for the «strIngredient9» of MealInfo
		TableColumn<MealInfo, String> strIngredient9Column = new TableColumn<>("strIngredient9");

		//Binding of the column to the «strIngredient9» property
		strIngredient9Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient9"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient9Column);

		//Creation of a TableColumn for the «strIngredient10» of MealInfo
		TableColumn<MealInfo, String> strIngredient10Column = new TableColumn<>("strIngredient10");

		//Binding of the column to the «strIngredient10» property
		strIngredient10Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient10"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient10Column);

		//Creation of a TableColumn for the «strIngredient11» of MealInfo
		TableColumn<MealInfo, String> strIngredient11Column = new TableColumn<>("strIngredient11");

		//Binding of the column to the «strIngredient11» property
		strIngredient11Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient11"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient11Column);

		//Creation of a TableColumn for the «strIngredient12» of MealInfo
		TableColumn<MealInfo, String> strIngredient12Column = new TableColumn<>("strIngredient12");

		//Binding of the column to the «strIngredient12» property
		strIngredient12Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient12"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient12Column);

		//Creation of a TableColumn for the «strIngredient13» of MealInfo
		TableColumn<MealInfo, String> strIngredient13Column = new TableColumn<>("strIngredient13");

		//Binding of the column to the «strIngredient13» property
		strIngredient13Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient13"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient13Column);

		//Creation of a TableColumn for the «strIngredient14» of MealInfo
		TableColumn<MealInfo, String> strIngredient14Column = new TableColumn<>("strIngredient14");

		//Binding of the column to the «strIngredient14» property
		strIngredient14Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient14"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient14Column);

		//Creation of a TableColumn for the «strIngredient15» of MealInfo
		TableColumn<MealInfo, String> strIngredient15Column = new TableColumn<>("strIngredient15");

		//Binding of the column to the «strIngredient15» property
		strIngredient15Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient15"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient15Column);

		//Creation of a TableColumn for the «strIngredient16» of MealInfo
		TableColumn<MealInfo, String> strIngredient16Column = new TableColumn<>("strIngredient16");

		//Binding of the column to the «strIngredient16» property
		strIngredient16Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient16"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient16Column);

		//Creation of a TableColumn for the «strIngredient17» of MealInfo
		TableColumn<MealInfo, String> strIngredient17Column = new TableColumn<>("strIngredient17");

		//Binding of the column to the «strIngredient17» property
		strIngredient17Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient17"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient17Column);

		//Creation of a TableColumn for the «strIngredient18» of MealInfo
		TableColumn<MealInfo, String> strIngredient18Column = new TableColumn<>("strIngredient18");

		//Binding of the column to the «strIngredient18» property
		strIngredient18Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient18"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient18Column);

		//Creation of a TableColumn for the «strIngredient19» of MealInfo
		TableColumn<MealInfo, String> strIngredient19Column = new TableColumn<>("strIngredient19");

		//Binding of the column to the «strIngredient19» property
		strIngredient19Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient19"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient19Column);

		//Creation of a TableColumn for the «strIngredient20» of MealInfo
		TableColumn<MealInfo, String> strIngredient20Column = new TableColumn<>("strIngredient20");

		//Binding of the column to the «strIngredient20» property
		strIngredient20Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient20"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient20Column);

			
	    //Creation of a TableColumn for the «strMeasure1» of MealInfo
		TableColumn<MealInfo, String> strMeasure1Column = new TableColumn<>("strMeasure1");

		//Binding of the column to the «strMeasure1» property
		strMeasure1Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure1"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure1Column);

		//Creation of a TableColumn for the «strMeasure2» of MealInfo
		TableColumn<MealInfo, String> strMeasure2Column = new TableColumn<>("strMeasure2");

		//Binding of the column to the «strMeasure2» property
		strMeasure2Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure2"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure2Column);

		//Creation of a TableColumn for the «strMeasure3» of MealInfo
		TableColumn<MealInfo, String> strMeasure3Column = new TableColumn<>("strMeasure3");

		//Binding of the column to the «strMeasure3» property
		strMeasure3Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure3"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure3Column);

		//Creation of a TableColumn for the «strMeasure4» of MealInfo
		TableColumn<MealInfo, String> strMeasure4Column = new TableColumn<>("strMeasure4");

		//Binding of the column to the «strMeasure4» property
		strMeasure4Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure4"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure4Column);

		//Creation of a TableColumn for the «strMeasure5» of MealInfo
		TableColumn<MealInfo, String> strMeasure5Column = new TableColumn<>("strMeasure5");

		//Binding of the column to the «strMeasure5» property
		strMeasure5Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure5"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure5Column);

		//Creation of a TableColumn for the «strMeasure6» of MealInfo
		TableColumn<MealInfo, String> strMeasure6Column = new TableColumn<>("strMeasure6");

		//Binding of the column to the «strMeasure6» property
		strMeasure6Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure6"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure6Column);

		//Creation of a TableColumn for the «strMeasure7» of MealInfo
		TableColumn<MealInfo, String> strMeasure7Column = new TableColumn<>("strMeasure7");

		//Binding of the column to the «strMeasure7» property
		strMeasure7Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure7"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure7Column);

		//Creation of a TableColumn for the «strMeasure8» of MealInfo
		TableColumn<MealInfo, String> strMeasure8Column = new TableColumn<>("strMeasure8");

		//Binding of the column to the «strMeasure8» property
		strMeasure8Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure8"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure8Column);

		//Creation of a TableColumn for the «strMeasure9» of MealInfo
		TableColumn<MealInfo, String> strMeasure9Column = new TableColumn<>("strMeasure9");

		//Binding of the column to the «strMeasure9» property
		strMeasure9Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure9"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure9Column);

		//Creation of a TableColumn for the «strMeasure10» of MealInfo
		TableColumn<MealInfo, String> strMeasure10Column = new TableColumn<>("strMeasure10");

		//Binding of the column to the «strMeasure10» property
		strMeasure10Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure10"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure10Column);

		//Creation of a TableColumn for the «strMeasure11» of MealInfo
		TableColumn<MealInfo, String> strMeasure11Column = new TableColumn<>("strMeasure11");

		//Binding of the column to the «strMeasure11» property
		strMeasure11Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure11"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure11Column);

		//Creation of a TableColumn for the «strMeasure12» of MealInfo
		TableColumn<MealInfo, String> strMeasure12Column = new TableColumn<>("strMeasure12");

		//Binding of the column to the «strMeasure12» property
		strMeasure12Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure12"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure12Column);

		//Creation of a TableColumn for the «strMeasure13» of MealInfo
		TableColumn<MealInfo, String> strMeasure13Column = new TableColumn<>("strMeasure13");

		//Binding of the column to the «strMeasure13» property
		strMeasure13Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure13"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure13Column);

		//Creation of a TableColumn for the «strMeasure14» of MealInfo
		TableColumn<MealInfo, String> strMeasure14Column = new TableColumn<>("strMeasure14");

		//Binding of the column to the «strMeasure14» property
		strMeasure14Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure14"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure14Column);

		//Creation of a TableColumn for the «strMeasure15» of MealInfo
		TableColumn<MealInfo, String> strMeasure15Column = new TableColumn<>("strMeasure15");

		//Binding of the column to the «strMeasure15» property
		strMeasure15Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure15"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure15Column);

		//Creation of a TableColumn for the «strMeasure16» of MealInfo
		TableColumn<MealInfo, String> strMeasure16Column = new TableColumn<>("strMeasure16");

		//Binding of the column to the «strMeasure16» property
		strMeasure16Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure16"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure16Column);

		//Creation of a TableColumn for the «strMeasure17» of MealInfo
		TableColumn<MealInfo, String> strMeasure17Column = new TableColumn<>("strMeasure17");

		//Binding of the column to the «strMeasure17» property
		strMeasure17Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure17"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure17Column);

		//Creation of a TableColumn for the «strMeasure18» of MealInfo
		TableColumn<MealInfo, String> strMeasure18Column = new TableColumn<>("strMeasure18");

		//Binding of the column to the «strMeasure18» property
		strMeasure18Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure18"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure18Column);

		//Creation of a TableColumn for the «strMeasure19» of MealInfo
		TableColumn<MealInfo, String> strMeasure19Column = new TableColumn<>("strMeasure19");

		//Binding of the column to the «strMeasure19» property
		strMeasure19Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure19"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure19Column);

		//Creation of a TableColumn for the «strMeasure20» of MealInfo
		TableColumn<MealInfo, String> strMeasure20Column = new TableColumn<>("strMeasure20");

		//Binding of the column to the «strMeasure20» property
		strMeasure20Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure20"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure20Column);

        //Creation of a TableColumn for the «strSource» property
        TableColumn<MealInfo, String> strSourceColumn = new TableColumn<>("strSource");

        //Binding of the column to the «strSource» property
        strSourceColumn.setCellValueFactory(new PropertyValueFactory<>("strSource"));

        //Adding of this column to the MealTableView
        MealTableView.getColumns().add(strSourceColumn);

        //Creation of a TableColumn for the «strImageSource» property of MealInfo
        TableColumn<MealInfo, String> strImageSourceColumn = new TableColumn<>("strImageSource");

        //Binding of the column to the «strImageSource» property
        strImageSourceColumn.setCellValueFactory(new PropertyValueFactory<>("strImageSource"));

        //Adding of this column to the MealTableView
        MealTableView.getColumns().add(strImageSourceColumn);

        //Creation of a TableColumn for the «strCreativeCommonsConfirmed» property of MealInfo
        TableColumn<MealInfo, String> strCreativeCommonsConfirmedColumn = new TableColumn<>("strCreativeCommonsConfirmed");

        //Binding of the column to the «strCreativeCommonsConfirmed» property
        strCreativeCommonsConfirmedColumn.setCellValueFactory(new PropertyValueFactory<>("strCreativeCommonsConfirmed"));

        //Adding of this column to the MealTableView
        MealTableView.getColumns().add(strCreativeCommonsConfirmedColumn);

        //Creation a TableColumn for the «dateModified» property of MealInfo
        TableColumn<MealInfo, String> dateModifiedColumn = new TableColumn<>("dateModified");

        //Binding of the column to the «dateModified» property
        dateModifiedColumn.setCellValueFactory(new PropertyValueFactory<>("dateModified"));
		
		 //Adding of buttons to flow pane
		 buttonFlowPane.getChildren().add(deleteCookedBtn);
		 buttonFlowPane.getChildren().add(moveMealBtn);
		 buttonFlowPane.getChildren().add(getDetailsBtn);
		
		 //Buttons layout inside the flow pane
		 buttonFlowPane.setAlignment(Pos.CENTER);
		 buttonFlowPane.setHgap(10);

		  //Elements layout inside the grid pane
		 rootGridPane.add(MealTableView, 0, 1);
		 rootGridPane.add(inputFieldsPane, 0, 0);
		 rootGridPane.add(buttonFlowPane, 0, 2);
		 rootGridPane.add(backBtn, 0, 3);
		 rootGridPane.setHgap(10);
		 rootGridPane.setVgap(10);

		 //Attach this class as the mouse click event handler for the buttons
		 deleteCookedBtn.setOnMouseClicked(this);
		 moveMealBtn.setOnMouseClicked(this);
		 getDetailsBtn.setOnMouseClicked(this);
		 backBtn.setOnMouseClicked(this);
		
		 //Creation of a File object representing «favourite.json»
        File favourite = new File("favourite.json");

        //Creation of a File object representing «cooked.json»
        File cooked = new File("cooked.json");

        //Enable pretty printing (indented output) for JSON generated by mapper1 (favourite meals)
        mapper1.enable(SerializationFeature.INDENT_OUTPUT);

        //Enable pretty printing (indented output) for JSON generated by mapper2 (cooked meals)
        mapper2.enable(SerializationFeature.INDENT_OUTPUT);
		
		      
		  //Check if the "cooked.json" file exists
		 if (cooked.exists())
		 {
		     try 
		     {
		         //Obtain a TypeFactory instance from mapper2 for advanced type handling
		         TypeFactory typeFactory = mapper2.getTypeFactory();
		
		         //Deserialize the JSON content of "cooked.json" into a List of MealInfo objects
		         //and assign it to the application's cooked meals list (CoMealList)
		         App.CoMealList = mapper2.readValue(
		             new File("cooked.json"),
		             typeFactory.constructCollectionType(List.class, MealInfo.class)
		         );
		
		         //Print a message to indicate successful deserialization of cooked meals
		         System.out.println("Cooked object deserialized from cooked.json:");
		         
		     } 
			 catch (IOException e) 
		     {
		         //Print the exception stack trace if an I/O error occurs during deserialization
		         e.printStackTrace();
		     }
		 }
		
		 //Print a message indicating that the cooked object has been serialized (or loaded)
		 System.out.println("Cooked object serialized to cooked.json");
	
	     //Check if the "favourite.json" file exists
	     if (favourite.exists())
	     {
	         try 
		     {
	             //Obtain a TypeFactory instance from mapper1 for advanced type handling
	             TypeFactory typeFactory = mapper1.getTypeFactory();
	
	             //Deserialize the JSON content of "favourite.json" into a List of MealInfo objects
	             //and assign it to the application's favourite meals list (FavMealList)
	             App.FavMealList = mapper1.readValue
				 (
	                 new File("favourite.json"),
	                 typeFactory.constructCollectionType(List.class, MealInfo.class)
	             );
	
	             //Print a message to indicate successful deserialization of favourite meals
	             System.out.println("Favourite object deserialized from favourite.json:");
	             
	         } 
			 catch (IOException e) 
			 {
	             //Print the exception stack trace if an I/O error occurs during deserialization
	             e.printStackTrace();
	         }
	     }
	
	     //Print a message indicating that the favourite object has been serialized (or loaded)
	     System.out.println("Favourite object serialized to favourite.json");
	
	     //Get the list of items currently displayed in the MealTableView
	     List<MealInfo> items = MealTableView.getItems();
	
	     //Clear all existing items from the TableView to prepare for fresh data
	     items.clear();
	
	     //Loop through each MealInfo object in the application's cooked meals list (CoMealList)
	     for (MealInfo Meal : App.CoMealList) 
	     {
	         //Add each MealInfo object to the TableView for display
	         items.add(Meal);
	     }
     }

	//Method to create and return a JavaFX Scene for this UI
	Scene createScene()
	{
	  //Create a new Scene using the rootGridPane as the root layout
	  //Set the width of the scene to 650 pixels and the height to 300 pixels
	  return new Scene(rootGridPane, 650, 300);
	}


	//Override the handle method from EventHandler<MouseEvent> to handle mouse click events
	@Override
	public void handle(MouseEvent event) 
	{
		 //Check if the event source is the deleteCookedBtn button
		 if (event.getSource() == deleteCookedBtn) 
		 {
		     try
		     {
		         //Get the selection model of the MealTableView to know which items are selected
		         TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
		
		         //Get the list of currently selected MealInfo objects
		         ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
		
		         //Loop through all MealInfo items currently in the MealTableView
		         for (MealInfo MI : MealTableView.getItems())
		         {
		             //If the current item is selected
		             if (selectedItems.contains(MI))
		             {
		                 //Remove the meal from the application's cooked meals list
		                 App.CoMealList.remove(MI);
		
		                 //Show a pop-up message confirming successful deletion
		                 MealPopUp mealPopUp = new MealPopUp("This meal has been successfully deleted from the list of cooked meals.");
		                 mealPopUp.show();
		             }
		         }
		
		         //Serialize the updated CoMealList to "cooked.json" to save the changes
		         mapper2.writeValue(new File("cooked.json"), App.CoMealList);
		
		         //Loop through each MealInfo in the updated CoMealList
		         for (MealInfo mi : App.CoMealList) 
				 {
		             try 
					 {
		                 //Convert each MealInfo object to a JSON string for logging purposes
		                 String cookedJsonString = mapper2.writeValueAsString(mi);
		
		                 //Print a message indicating the meal has been serialized
		                 System.out.println("Cooked object serialized to JSON string:");
		
		                 //Print the JSON string of the meal
		                 System.out.println(cookedJsonString);
		
		             } 
					 catch (IOException e) 
					 {
		                 //Print the stack trace if an I/O error occurs during serialization
		                 e.printStackTrace();
		             }
		         }
		
		         //Get the items currently displayed in the TableView
		         List<MealInfo> items = MealTableView.getItems();
		
		         //Clear all items from the TableView to refresh the display
		         items.clear();
		
		         //Loop through each MealInfo in the updated CoMealList
		         for (MealInfo Meal : App.CoMealList) 
		         {
		             //Add each meal back to the TableView for display
		             items.add(Meal);
		         }
		     }
		     //Catch block for JSON generation errors
		     catch (JsonGenerationException e1) 
			 {
		         System.err.println("Failed to generate JSON output for cooked.json");
		         e1.printStackTrace();
		     } 
		     //Catch block for JSON mapping errors
		     catch (JsonMappingException e1) 
			 {
		         e1.printStackTrace();
		     } 
		     //Catch block for general I/O errors
		     catch (IOException e1) 
			 {
		         e1.printStackTrace();
		     }
		 }
		//Check if the event source is the moveMealBtn button
		else if (event.getSource() == moveMealBtn) 
		{
		  try
		  {
		      //Get the selection model of the MealTableView to know which items are selected
		      TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
		
		      //Get the list of currently selected MealInfo objects
		      ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
		
		      //Loop through all MealInfo items currently in the MealTableView
		      for (MealInfo MI : MealTableView.getItems())
		      {
		          //If the meal is NOT already in the favourite meals list
		          if (!App.FavMealList.contains(MI))
		          {
		              //Remove the meal from the cooked meals list
		              App.CoMealList.remove(MI);
		
		              //Add the meal to the favourite meals list
		              App.FavMealList.add(MI);
		
		              //Show a pop-up message confirming the meal has been moved
		              MealPopUp mealPopUp = new MealPopUp("This meal has been successfully moved from the list of cooked meals to the list of favourite meals.");
		              mealPopUp.show();
		          }
		          else
		          {
		              //Show a pop-up message indicating the meal is already in favourites
		              MealPopUp mealPopUp = new MealPopUp("This meal is already in the list of favourite meals.");
		              mealPopUp.show();
		          }
		      }
		
		      //Serialize the updated favourite meals list to "favourite.json"
		      mapper1.writeValue(new File("favourite.json"), App.FavMealList);
		
		      //Loop through each MealInfo in the updated favourite list to log JSON
		      for (MealInfo mi : App.FavMealList) 
			  {
		          try 
				  {
		              //Convert each MealInfo object to a JSON string for logging purposes
		              String favouriteJsonString = mapper1.writeValueAsString(mi);
		
		              //Print a message indicating the favourite meal has been serialized
		              System.out.println("Favourite object serialized to JSON string:");
		
		              //Print the JSON string
		              System.out.println(favouriteJsonString);
		
		          } 
				  catch (IOException e) 
				  {
		              //Print stack trace if an I/O error occurs during serialization
		              e.printStackTrace();
		          }
		      }
		
		      //Serialize the updated cooked meals list to "cooked.json"
		      mapper2.writeValue(new File("cooked.json"), App.CoMealList);
		
		      //Loop through each MealInfo in the updated cooked list to log JSON
		      for (MealInfo mi : App.CoMealList) 
			  {
		          try 
				  {
		              //Convert each MealInfo object to a JSON string for logging purposes
		              String cookedJsonString = mapper2.writeValueAsString(mi);
		
		              //Print a message indicating the cooked meal has been serialized
		              System.out.println("Cooked object serialized to JSON string:");
		
		              //Print the JSON string
		              System.out.println(cookedJsonString);
		
		          } 
				  catch (IOException e) 
				  {
		              //Print stack trace if an I/O error occurs during serialization
		              e.printStackTrace();
		          }
		      }
		
		      //Get the items currently displayed in the TableView
		      List<MealInfo> items = MealTableView.getItems();
		
		      //Clear all items from the TableView to refresh the display
		      items.clear();
		
		      //Loop through each MealInfo in the updated cooked meals list
		      for (MealInfo Meal : App.CoMealList) 
		      {
		          //Add each meal back to the TableView for display
		          items.add(Meal);
		      }
		  }
		  //Catch block for JSON generation errors
		  catch (JsonGenerationException e1) 
		  {
		      System.err.println("JSON generation failed while writing favourite.json or cooked.json from Meal lists");
		      e1.printStackTrace();
		  } 
		  //Catch block for JSON mapping errors
		  catch (JsonMappingException e1) 
		  {
		      e1.printStackTrace();
		  } 
		  //Catch block for general I/O errors
		  catch (IOException e1) 
		  {
		      e1.printStackTrace();
		  }
		}
		
		//Check if the event source is the «getDetailsBtn» button
		else if (event.getSource() == getDetailsBtn) 
		{
			  //TableView's selection model to access selected items
			  TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
			
			  //Get the currently selected MealInfo items from the TableView
			  ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
			
			  //Declaration of a local list variable
			  List<MealInfo> MealList = null;
			
			  //Iterate over all items in the TableView
			  for (MealInfo MI : MealTableView.getItems())
			  {
				   //Check if the current item is among the selected items
				  if (selectedItems.contains(MI))
				  {
				      //Creation of get details scene
					  GetDetailsSceneCreator getDetailsSceneCreator = new GetDetailsSceneCreator(MI);
					  Scene getDetailsScene = getDetailsSceneCreator.createScene();
					
					  //Creation of get details scene window for displaying the details of a meal
					  Stage getDetailsStage = new Stage();
					  getDetailsStage.setTitle("Get Details");
					  getDetailsStage.setScene(getDetailsScene);
					
					  //Presenting of get details scene window
					  getDetailsStage.show();
				 }
			}
		}
		
		//Check if the event source is the "Back" button
    	else if (event.getSource() == backBtn) 
    	{
    	   //Switch the meal scene to main scene
    	   App.primaryStage.setScene(App.mainScene);
    	}
	
	}

}





