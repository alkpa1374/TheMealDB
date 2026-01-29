//Class "CookedSceneCreator" belongs to package "gr.unipi.MealFX"
package gr.unipi.MealFX;

//Import of File class for files representation in file system
import java.io.File;

//Import of IOException for handling input/output exceptions when working with files
import java.io.IOException;

//Import of ArrayList for objects dynamically-sized lists
import java.util.ArrayList;

//Import of List interface for collection-type list usage
import java.util.List;

//Import of exception class for JSON generation errors from Jackson library
import com.fasterxml.jackson.core.JsonGenerationException;

//Import of exception class for JSON mapping errors from Jackson library
import com.fasterxml.jackson.databind.JsonMappingException;

//Import of ObjectMapper for JSON data reading and writing from Jackson library
import com.fasterxml.jackson.databind.ObjectMapper;

//Import of SerializationFeature for formatting options configuration for JSON output
import com.fasterxml.jackson.databind.SerializationFeature;

//Import of TypeFactory for construction of JSON deserialization of complex collection types from Jackson library
import com.fasterxml.jackson.databind.type.TypeFactory;

//Import of custom exception class for handling Meal API related errors
import exception.MealAPIException;

//Import of ObservableList, a JavaFX collection allowing UI controls automatic updates in table view
import javafx.collections.ObservableList;

//Import of EventHandler interface to handle mouse clicks events
import javafx.event.EventHandler;

//Import of Pos enumeration for JavaFX layout panes alignment setting (e.g., CENTER)
import javafx.geometry.Pos;

//Import of Scene class for representation of an all-content container in a JavaFX window
import javafx.scene.Scene;

//Import of Alert dialog class for showing pop-up messages to user
import javafx.scene.control.Alert;

//Import of AlertType enum for specification of alert type (e.g. INFORMATION, ERROR)
import javafx.scene.control.Alert.AlertType;

//Import of Button control to allow user interactions
import javafx.scene.control.Button;

//Import of Label control for text display in the UI
import javafx.scene.control.Label;

//Import of table view control for tabular data displaying
import javafx.scene.control.TableView;

//Import of TableViewSelectionModel for handling of selection operations within table view
import javafx.scene.control.TableView.TableViewSelectionModel;

//Import of TextField control for single-line text user input
import javafx.scene.control.TextField;

//Import of PropertyValueFactory for mapping of table columns to object properties for TableView
import javafx.scene.control.cell.PropertyValueFactory;

//Import of FlowPane layout for horizontal/vertical UI elements arrangement
import javafx.scene.layout.FlowPane;

//Import of GridPane layout for arranging UI elements in flexible rows/column grid
import javafx.scene.layout.GridPane;

//Import of Stage class for representation of top-level JavaFX window
import javafx.stage.Stage;

//Import of MealInfo model representation of meal entity
import model.MealInfo;

//Import of service class for Meal API interaction
import service.MealAPIService;

//Import of MouseEvent class for handling input mouse events
import javafx.scene.input.MouseEvent;

//Import of TableColumn class for definition of columns in table view
import javafx.scene.control.TableColumn;

//Class "CookedSceneCreator" for meal scene implementation
public class CookedSceneCreator implements EventHandler<MouseEvent>
{
	 //Flow Pane
	 FlowPane buttonFlowPane;

	 //Grid Panes
	 GridPane rootGridPane, inputFieldsPane;

	 //Meal scene buttons
	 Button deleteCookedBtn, moveMealBtn, getDetailsBtn, backBtn;

     //Table view for displaying of MealInfo objects list in a tabular form
     TableView<MealInfo> MealTableView;
	
	 //Jackson ObjectMapper instances for JSON serialization/deserialization
     ObjectMapper mapper1 = new ObjectMapper();
     ObjectMapper mapper2 = new ObjectMapper();

	//Constructor for cooked scene creation
	public CookedSceneCreator() 
	{
	//Creation of root grid pane
        rootGridPane = new GridPane();

        //Creation of input fields pane
        inputFieldsPane = new GridPane();

        //Creation of button flow pane
        buttonFlowPane = new FlowPane();

        //Creation of buttons
		 deleteCookedBtn = new Button("Delete Cooked");
		 moveMealBtn = new Button("Move Meal");
		 getDetailsBtn = new Button("Get Details");
		 backBtn = new Button("Back");
		
		 //Creation of a table view
		 MealTableView = new TableView<MealInfo>();
		
		//Creation of a TableColumn for the "idMeal" property
        TableColumn<MealInfo, String> idMealColumn = new TableColumn<>("idMeal");
        //Binding of the column to the "idMeal" property
        idMealColumn.setCellValueFactory(new PropertyValueFactory<>("idMeal"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(idMealColumn);

        //Creation of a TableColumn for the "strMeal" property
        TableColumn<MealInfo, String> strMealColumn = new TableColumn<>("strMeal");
        //Binding of the column to the "strMeal" property
        strMealColumn.setCellValueFactory(new PropertyValueFactory<>("strMeal"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strMealColumn);

        //Creation of a TableColumn for the "strMealAlternate" property
        TableColumn<MealInfo, String> strMealAlternateColumn = new TableColumn<>("strMealAlternate");
        //Binding of the column to the "strMealAlternate" property
        strMealAlternateColumn.setCellValueFactory(new PropertyValueFactory<>("strMealAlternate"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strMealAlternateColumn);

        //Creation of a TableColumn for the "strCategory" property
        TableColumn<MealInfo, String> strCategoryColumn = new TableColumn<>("strCategory");
        //Binding of the column to the "strCategory" property
        strCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("strCategory"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strCategoryColumn);

        //Creation of a TableColumn for the "strArea" property
        TableColumn<MealInfo, String> strAreaColumn = new TableColumn<>("strArea");
        //Binding of the column to the "strArea" property
        strAreaColumn.setCellValueFactory(new PropertyValueFactory<>("strArea"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strAreaColumn);

        //Creation of a TableColumn for the "strInstructions" property
        TableColumn<MealInfo, String> strInstructionsColumn = new TableColumn<>("strInstructions");
        //Binding of the column to the "strInstructions" property
        strInstructionsColumn.setCellValueFactory(new PropertyValueFactory<>("strInstructions"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strInstructionsColumn);

        //Creation of a TableColumn for the "strMealThumb" property (image URL)
        TableColumn<MealInfo, String> strMealThumbColumn = new TableColumn<>("strMealThumb");
        //Binding of the column to the "strMealThumb" property
        strMealThumbColumn.setCellValueFactory(new PropertyValueFactory<>("strMealThumb"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strMealThumbColumn);

        //Creation of a TableColumn for the "strTags" property
        TableColumn<MealInfo, String> strTagsColumn = new TableColumn<>("strTags");
        //Binding of the column to the "strTags" property
        strTagsColumn.setCellValueFactory(new PropertyValueFactory<>("strTags"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strTagsColumn);

        //Creation of a TableColumn for the "strYoutube" property (YouTube link)
        TableColumn<MealInfo, String> strYoutubeColumn = new TableColumn<>("strYoutube");
        //Binding of the column to the "strYoutube" property
        strYoutubeColumn.setCellValueFactory(new PropertyValueFactory<>("strYoutube"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strYoutubeColumn);

        //Creation of a table column for the "strIngredient1" property
		TableColumn<MealInfo, String> strIngredient1Column = new TableColumn<>("strIngredient1");
		//Binding of the column to the "strIngredient1" property
		strIngredient1Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient1"));
		//Addition of this column to the table view

		MealTableView.getColumns().add(strIngredient1Column);
		//Creation of a table column for the "strIngredient2" property
		TableColumn<MealInfo, String> strIngredient2Column = new TableColumn<>("strIngredient2");
		//Binding of the column to the "strIngredient2" property
		strIngredient2Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient2"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient2Column);

		//Creation of a table column for the "strIngredient3" property
		TableColumn<MealInfo, String> strIngredient3Column = new TableColumn<>("strIngredient3");
		//Binding of the column to the "strIngredient3" property
		strIngredient3Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient3"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient3Column);

		//Creation of a table column for the "strIngredient4" property
		TableColumn<MealInfo, String> strIngredient4Column = new TableColumn<>("strIngredient4");
		//Binding of the column to the "strIngredient4" property
		strIngredient4Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient4"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient4Column);

		//Creation of a table column for the "strIngredient5" property
		TableColumn<MealInfo, String> strIngredient5Column = new TableColumn<>("strIngredient5");
		//Binding of the column to the "strIngredient5" property
		strIngredient5Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient5"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient5Column);

		//Creation of a table column for the "strIngredient6" property
		TableColumn<MealInfo, String> strIngredient6Column = new TableColumn<>("strIngredient6");
		//Binding of the column to the "strIngredient6" property
		strIngredient6Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient6"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient6Column);

		//Creation of a table column for the "strIngredient7" property
		TableColumn<MealInfo, String> strIngredient7Column = new TableColumn<>("strIngredient7");
		//Binding of the column to the "strIngredient7" property
		strIngredient7Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient7"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient7Column);

		//Creation of a table column for the "strIngredient8" property
		TableColumn<MealInfo, String> strIngredient8Column = new TableColumn<>("strIngredient8");
		//Binding of the column to the "strIngredient8" property
		strIngredient8Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient8"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient8Column);

		//Creation of a table column for the "strIngredient9" property
		TableColumn<MealInfo, String> strIngredient9Column = new TableColumn<>("strIngredient9");
		//Binding of the column to the "strIngredient9" property
		strIngredient9Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient9"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient9Column);

		//Creation of a table column for the "strIngredient10" property
		TableColumn<MealInfo, String> strIngredient10Column = new TableColumn<>("strIngredient10");
		//Binding of the column to the "strIngredient10" property
		strIngredient10Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient10"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient10Column);

		//Creation of a table column for the "strIngredient11" property
		TableColumn<MealInfo, String> strIngredient11Column = new TableColumn<>("strIngredient11");
		//Binding of the column to the "strIngredient11" property
		strIngredient11Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient11"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient11Column);

		//Creation of a table column for the "strIngredient12" property
		TableColumn<MealInfo, String> strIngredient12Column = new TableColumn<>("strIngredient12");
		//Binding of the column to the "strIngredient12" property
		strIngredient12Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient12"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient12Column);

		//Creation of a table column for the "strIngredient13" property
		TableColumn<MealInfo, String> strIngredient13Column = new TableColumn<>("strIngredient13");
		//Binding of the column to the "strIngredient13" property
		strIngredient13Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient13"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient13Column);

		//Creation of a table column for the "strIngredient14" property
		TableColumn<MealInfo, String> strIngredient14Column = new TableColumn<>("strIngredient14");
		//Binding of the column to the "strIngredient14" property
		strIngredient14Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient14"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient14Column);

		//Creation of a table column for the "strIngredient15" property
		TableColumn<MealInfo, String> strIngredient15Column = new TableColumn<>("strIngredient15");
		//Binding of the column to the "strIngredient15" property
		strIngredient15Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient15"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient15Column);

		//Creation of a table column for the "strIngredient16" property
		TableColumn<MealInfo, String> strIngredient16Column = new TableColumn<>("strIngredient16");
		//Binding of the column to the "strIngredient16" property
		strIngredient16Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient16"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient16Column);

		//Creation of a table column for the "strIngredient17" property
		TableColumn<MealInfo, String> strIngredient17Column = new TableColumn<>("strIngredient17");
		//Binding of the column to the "strIngredient17" property
		strIngredient17Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient17"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient17Column);

		//Creation of a table column for the "strIngredient18" property
		TableColumn<MealInfo, String> strIngredient18Column = new TableColumn<>("strIngredient18");
		//Binding of the column to the "strIngredient18" property
		strIngredient18Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient18"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient18Column);

		//Creation of a table column for the "strIngredient19" property
		TableColumn<MealInfo, String> strIngredient19Column = new TableColumn<>("strIngredient19");
		//Binding of the column to the "strIngredient19" property
		strIngredient19Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient19"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient19Column);

		//Creation of a table column for the "strIngredient20" property
		TableColumn<MealInfo, String> strIngredient20Column = new TableColumn<>("strIngredient20");
		//Binding of the column to the "strIngredient20" property
		strIngredient20Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient20"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient20Column);

	    //Creation of a table column for the "strMeasure1" property
		TableColumn<MealInfo, String> strMeasure1Column = new TableColumn<>("strMeasure1");
		//Binding of the column to the "strMeasure1" property
		strMeasure1Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure1"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure1Column);

		//Creation of a table column for the "strMeasure2" property
		TableColumn<MealInfo, String> strMeasure2Column = new TableColumn<>("strMeasure2");
		//Binding of the column to the "strMeasure2" property
		strMeasure2Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure2"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure2Column);

		//Creation of a table column for the "strMeasure3" property
		TableColumn<MealInfo, String> strMeasure3Column = new TableColumn<>("strMeasure3");
		//Binding of the column to the "strMeasure3" property
		strMeasure3Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure3"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure3Column);

		//Creation of a table column for the "strMeasure4" property
		TableColumn<MealInfo, String> strMeasure4Column = new TableColumn<>("strMeasure4");
		//Binding of the column to the "strMeasure4" property
		strMeasure4Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure4"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure4Column);

		//Creation of a table column for the "strMeasure5" property
		TableColumn<MealInfo, String> strMeasure5Column = new TableColumn<>("strMeasure5");
		//Binding of the column to the "strMeasure5" property
		strMeasure5Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure5"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure5Column);

		//Creation of a table column for the "strMeasure6" property
		TableColumn<MealInfo, String> strMeasure6Column = new TableColumn<>("strMeasure6");
		//Binding of the column to the "strMeasure6" property
		strMeasure6Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure6"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure6Column);

		//Creation of a table column for the "strMeasure7" property
		TableColumn<MealInfo, String> strMeasure7Column = new TableColumn<>("strMeasure7");
		//Binding of the column to the "strMeasure7" property
		strMeasure7Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure7"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure7Column);

		//Creation of a table column for the "strMeasure8" property
		TableColumn<MealInfo, String> strMeasure8Column = new TableColumn<>("strMeasure8");
		//Binding of the column to the "strMeasure8" property
		strMeasure8Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure8"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure8Column);

		//Creation of a table column for the "strMeasure9" property
		TableColumn<MealInfo, String> strMeasure9Column = new TableColumn<>("strMeasure9");
		//Binding of the column to the "strMeasure9" property
		strMeasure9Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure9"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure9Column);

		//Creation of a table column for the "strMeasure10" property
		TableColumn<MealInfo, String> strMeasure10Column = new TableColumn<>("strMeasure10");
		//Binding of the column to the "strMeasure10" property
		strMeasure10Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure10"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure10Column);

		//Creation of a table column for the "strMeasure11" property
		TableColumn<MealInfo, String> strMeasure11Column = new TableColumn<>("strMeasure11");
		//Binding of the column to the "strMeasure11" property
		strMeasure11Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure11"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure11Column);

		//Creation of a table column for the "strMeasure12" property
		TableColumn<MealInfo, String> strMeasure12Column = new TableColumn<>("strMeasure12");
		//Binding of the column to the "strMeasure12" property
		strMeasure12Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure12"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure12Column);

		//Creation of a table column for the "strMeasure13" property
		TableColumn<MealInfo, String> strMeasure13Column = new TableColumn<>("strMeasure13");
		//Binding of the column to the "strMeasure13" property
		strMeasure13Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure13"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure13Column);

		//Creation of a table column for the "strMeasure14" property
		TableColumn<MealInfo, String> strMeasure14Column = new TableColumn<>("strMeasure14");
		//Binding of the column to the "strMeasure14" property
		strMeasure14Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure14"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure14Column);

		//Creation of a table column for the "strMeasure15" property
		TableColumn<MealInfo, String> strMeasure15Column = new TableColumn<>("strMeasure15");
		//Binding of the column to the "strMeasure15" property
		strMeasure15Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure15"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure15Column);

		//Creation of a table column for the "strMeasure16" property
		TableColumn<MealInfo, String> strMeasure16Column = new TableColumn<>("strMeasure16");
		//Binding of the column to the "strMeasure16" property
		strMeasure16Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure16"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure16Column);

		//Creation of a table column for the "strMeasure17" property
		TableColumn<MealInfo, String> strMeasure17Column = new TableColumn<>("strMeasure17");
		//Binding of the column to the "strMeasure17" property
		strMeasure17Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure17"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure17Column);

		//Creation of a table column for the "strMeasure18" property
		TableColumn<MealInfo, String> strMeasure18Column = new TableColumn<>("strMeasure18");
		//Binding of the column to the "strMeasure18" property
		strMeasure18Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure18"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure18Column);

		//Creation of a table column for the "strMeasure19" property
		TableColumn<MealInfo, String> strMeasure19Column = new TableColumn<>("strMeasure19");
		//Binding of the column to the "strMeasure19" property
		strMeasure19Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure19"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure19Column);

		//Creation of a table column for the "strMeasure20" property
		TableColumn<MealInfo, String> strMeasure20Column = new TableColumn<>("strMeasure20");
		//Binding of the column to the "strMeasure20" property
		strMeasure20Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure20"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure20Column);

        //Creation of a TableColumn for the "strSource" property
        TableColumn<MealInfo, String> strSourceColumn = new TableColumn<>("strSource");
        //Binding of the column to the "strSource" property
        strSourceColumn.setCellValueFactory(new PropertyValueFactory<>("strSource"));
        //Addition of this column to the MealTableView
        MealTableView.getColumns().add(strSourceColumn);

        //Creation of a TableColumn for the "strImageSource" property
        TableColumn<MealInfo, String> strImageSourceColumn = new TableColumn<>("strImageSource");
        //Binding of the column to the "strImageSource" property
        strImageSourceColumn.setCellValueFactory(new PropertyValueFactory<>("strImageSource"));
        //Addition of this column to the MealTableView
        MealTableView.getColumns().add(strImageSourceColumn);

		 //Creation of a TableColumn for the "strCreativeCommonsConfirmed" property
        TableColumn<MealInfo, String> strCreativeCommonsConfirmedColumn = new TableColumn<>("strCreativeCommonsConfirmed");
        //Binding of the column to the "strCreativeCommonsConfirmed" property
        strCreativeCommonsConfirmedColumn.setCellValueFactory(new PropertyValueFactory<>("strCreativeCommonsConfirmed"));
        //Addition of this column to the MealTableView
        MealTableView.getColumns().add(strCreativeCommonsConfirmedColumn);

		 //Creation of a TableColumn for the "dateModified" property
        TableColumn<MealInfo, String> dateModifiedColumn = new TableColumn<>("dateModified");
        //Binding of the column to the "dateModified" property
        dateModifiedColumn.setCellValueFactory(new PropertyValueFactory<>("dateModified"));
        //Addition of this column to the MealTableView
        MealTableView.getColumns().add(dateModifiedColumn);
		
		 //Addition of buttons to flow pane
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

		 //Attachment of this class as the mouse click event handler for buttons
		 deleteCookedBtn.setOnMouseClicked(this);
		 moveMealBtn.setOnMouseClicked(this);
		 getDetailsBtn.setOnMouseClicked(this);
		 backBtn.setOnMouseClicked(this);
		
		 //Creation of File object representation of "favourite.json"
         File favourite = new File("favourite.json");

         //Creation of File object representation of "cooked.json"
         File cooked = new File("cooked.json");

        //Enabling of pretty printing (indented output) for JSON generated by mapper1 (favourite meals)
        mapper1.enable(SerializationFeature.INDENT_OUTPUT);

        //Enabling of pretty printing (indented output) for JSON generated by mapper2 (cooked meals)
        mapper2.enable(SerializationFeature.INDENT_OUTPUT);
		
		      
		 //Checking of the existance of "cooked.json"
		 if (cooked.exists())
		 {
		     try 
		     {
		         //Obtaining of a TypeFactory instance from mapper2 for advanced type handling
		         TypeFactory typeFactory = mapper2.getTypeFactory();
		
		         //Deserialization of JSON content of "cooked.json" into a MealInfo objects List and assignment to the application's cooked meals list (CoMealList)
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
	             //Obtaining of TypeFactory instance from mapper1 for advanced type handling
	             TypeFactory typeFactory = mapper1.getTypeFactory();
	
	             //Deserialization of the JSON content of "favourite.json" into a List of MealInfo object and assignment to the application's favourite meals list (FavMealList)
	             App.FavMealList = mapper1.readValue
				 (
	                 new File("favourite.json"),
	                 typeFactory.constructCollectionType(List.class, MealInfo.class)
	             );
	
	             //Printing of a message indicating favourite meals successful deserialization
	             System.out.println("Favourite object deserialized from favourite.json:");
	             
	         }
			 //Printing of exception stack trace if an I/O error occurs during deserialization
			 catch (IOException e) 
			 {
	             e.printStackTrace();
	         }
	     }
	
	     //Printing of a message indicating serialization/loading of favourite object
	     System.out.println("Favourite object serialized to favourite.json");
	
	     //Getting of current items from table view
	     List<MealInfo> items = MealTableView.getItems();
	
	     //Clearance of the table view, before new results addition
	     items.clear();
	
	     //Addition of all meals returned by the REST API of THEMEALDB to the table view
	     for (MealInfo Meal : App.CoMealList) 
	     {
	         items.add(Meal);
	     }
     }

	//Method of JavaFX Scene creation and return for this UI
	Scene createScene()
	{
	  //Creation of new Scene using grid pane as the root layout
	    //Setting of width of scene to 650 pixels and height to 300 pixels
	  return new Scene(rootGridPane, 650, 300);
	}


    //Overriding of the handling method from EventHandler to respond to mouse events
	@Override
	public void handle(MouseEvent event) 
	{
    	//Checking of the "Delete Cooked" button as the event source
		 if (event.getSource() == deleteCookedBtn) 
		 {
		     try
		     {
		         //TableView's selection model to access selected items
		         TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
		
		         //Getting of currently selected MealInfo items from the table view
		         ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
		
		         //Iteration over all items in the table view
		         for (MealInfo MI : MealTableView.getItems())
		         {
		             //Checking if current item is among selected items
		             if (selectedItems.contains(MI))
		             {
		                 //Removal of meal from cooked meals list
		                 App.CoMealList.remove(MI);
		
                         //Presentation of custom pop-up window notifying the user the meal has been successfully deleted from cooked meals list		                 
						 MealPopUp mealPopUp = new MealPopUp("This meal has been successfully deleted from the list of cooked meals.");
						 mealPopUp.show();
		             }
		         }
		
		         //Writing of updated list of cooked meals list to "cooked.json"
		         mapper2.writeValue(new File("cooked.json"), App.CoMealList);
		
		         //Printing of each cooked meal as a JSON string to console for verification
		         for (MealInfo mi : App.CoMealList) 
				 {
		             try 
					 {
		                 //Converting of each MealInfo object to a JSON string for logging purposes
		                 String cookedJsonString = mapper2.writeValueAsString(mi);
		                 System.out.println("Cooked object serialized to JSON string:");
		                 System.out.println(cookedJsonString);
		
		             } 
				     //Handling of IOExceptions during file writing
					 catch (IOException e) 
					 {
		                  e.printStackTrace();
		             }
		         }
		
		         //Getting of current items from table view
		         List<MealInfo> items = MealTableView.getItems();
		
		         //Clearance of the table view, before new results addition
		         items.clear();
		
		         //Addition of all cooked meals returned by the REST API of THEMEALDB to the table view
		         for (MealInfo Meal : App.CoMealList) 
		         {
		             items.add(Meal);
		         }
		     }
		    //Handling of JSON generation exceptions
    	    catch (JsonGenerationException e1) {
    	        System.err.println("JSON generation failed while writing favourite.json from Meal list");
    	        e1.printStackTrace();
    	    }
    	    //Handling of JSON mapping exceptions
    	    catch (JsonMappingException e1) {
    	        e1.printStackTrace();
    	    }
    	    //Handling of IOExceptions during file writing
    	    catch (IOException e1) {
    	        e1.printStackTrace();
    	    }
		 }
		//Checking of the "Move Meal" button as the event source
		else if (event.getSource() == moveMealBtn) 
		{
		  try
		  {
		      //TableView's selection model to access selected items
		      TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
		
		      //Getting of currently selected MealInfo items from the table view
		      ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
		
		      //Iteration over all items in the table view
		      for (MealInfo MI : MealTableView.getItems())
		      {
		          //Checking if current item is among selected items
    	            	  if (selectedItems.contains(MI))
    	            	  {
		          //Checking if current item is among selected items
		          if (!App.FavMealList.contains(MI))
		          {
		              //Removal of meal from cooked meals list
		              App.CoMealList.remove(MI);
		
		              //Addition of meal to favourite meals list
		              App.FavMealList.add(MI);
		
		              //Presentation of custom pop-up window notifying the user the meal has been successfully moved from cooked meals list to favourite meals 
		              MealPopUp mealPopUp = new MealPopUp("This meal has been successfully moved from the list of cooked meals to the list of favourite meals.");
		              mealPopUp.show();
		          }
		          else
		          {
		              //Presentation of custom pop-up window notifying the user the meal is already on favourite meals list
		              MealPopUp mealPopUp = new MealPopUp("This meal is already in the list of favourite meals.");
		              mealPopUp.show();
		          }
		        }
		      }
		
		      //Writing of updated list of favourite meals list to "favourite.json"
		      mapper1.writeValue(new File("favourite.json"), App.FavMealList);
		
		      //Printing of each favourite meal as a JSON string to console for verification
		      for (MealInfo mi : App.FavMealList) 
			  {
		          try 
				  {
		              String favouriteJsonString = mapper1.writeValueAsString(mi);
					  System.out.println("Favourite object serialized to JSON string:");
		              System.out.println(favouriteJsonString);
		
		          } 
				  //Handling of IOExceptions during file writing
				  catch (IOException e) 
				  {
		               e.printStackTrace();
		          }
		      }
		
		      //Writing of updated list of cooked meals list to "cooked.json"
		      mapper2.writeValue(new File("cooked.json"), App.CoMealList);
		
		      //Printing of each cooked meal as a JSON string to console for verification
		      for (MealInfo mi : App.CoMealList) 
			  {
		          try 
				  {
		              String cookedJsonString = mapper2.writeValueAsString(mi);
		              System.out.println("Cooked object serialized to JSON string:");
		              System.out.println(cookedJsonString);
		
		          } 
				  //Handling of IOExceptions during file writing
				  catch (IOException e) 
				  {
					  e.printStackTrace();
				  }
		      }
		
		      //Getting of current items from table view
		      List<MealInfo> items = MealTableView.getItems();
		
		      //Clearance of the table view, before new results addition
		      items.clear();
		
		      //Addition of all cooked meals to table view
		      for (MealInfo Meal : App.CoMealList) 
		      {
		          items.add(Meal);
		      }
		}
		//Handling of JSON generation exceptions
		catch (JsonGenerationException e1) {
			System.err.println("JSON generation failed while writing favourite.json from Meal list");
			e1.printStackTrace();
		}
		//Handling of JSON mapping exceptions
		catch (JsonMappingException e1) {
			e1.printStackTrace();
		}
		//Handling of IOExceptions during file writing
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
		
		//Checking of the "Get Details" button as the event source
		else if (event.getSource() == getDetailsBtn) 
		{
			  //TableView's selection model to access selected items
			  TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
			
			  //Getting of currently selected MealInfo items from the table view
			  ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
			
			  //Declaration of a local list variable
			  List<MealInfo> MealList = null;
			
			  //Iteration over all items in the table view
			  for (MealInfo MI : MealTableView.getItems())
			  {
				  //Checking if current item is among selected items
				  if (selectedItems.contains(MI))
				  {
				      //Creation of get details scene
					  GetDetailsSceneCreator getDetailsSceneCreator = new GetDetailsSceneCreator(MI);
					  Scene getDetailsScene = getDetailsSceneCreator.createScene();
					
					  //Creation of get details scene window for displaying meal details
					  Stage getDetailsStage = new Stage();
					  getDetailsStage.setTitle("Get Details");
					  getDetailsStage.setScene(getDetailsScene);
					
					  //Presentation of get details scene window
					  getDetailsStage.show();
				 }
			}
		}
		
		//Checking of the "Back" button as the event source
    	else if (event.getSource() == backBtn) 
    	{
    	   //Switching of meal scene to main scene
    	   App.primaryStage.setScene(App.mainScene);
    	}
	
	}
}
