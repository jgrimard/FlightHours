package view;

import controller.AircraftDAO;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import model.Aircraft;

public class MainStage extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Flight Hours System");

        //Main layout manager for aircraftSearchScene
        BorderPane borderPane = new BorderPane();

        //Set up menu bar
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuHelp = new Menu("Help");
        MenuItem exitMenuItem = new MenuItem("Exit");
        MenuItem aboutMenuItem = new MenuItem("About");
        menuFile.getItems().addAll(exitMenuItem);
        menuHelp.getItems().addAll(aboutMenuItem);
        menuBar.getMenus().addAll(menuFile, menuHelp);
        borderPane.setTop(menuBar);

        //Create outer grid pane
        GridPane outerGridPane = new GridPane();
        outerGridPane.setId("outerGridPane");
        borderPane.setCenter(outerGridPane);
        Image logo = new Image(MainStage.class.getResourceAsStream("Logo.png"));
        ImageView logoImageView = new ImageView(logo);
        GridPane.setHalignment(logoImageView, HPos.CENTER);
        outerGridPane.add(logoImageView, 0, 0);
        Label aircraftSearchLabel = new Label("Aircraft Search");
        aircraftSearchLabel.setId("titleLabel");
        outerGridPane.add(aircraftSearchLabel, 0, 1);
        GridPane.setHalignment(aircraftSearchLabel, HPos.CENTER);

        //Create search pane and components
        GridPane searchGridPane = new GridPane();
        GridPane.setFillWidth(searchGridPane, Boolean.FALSE);
        GridPane.setHalignment(searchGridPane, HPos.CENTER);
        searchGridPane.setId("searchGridPane");
        outerGridPane.add(searchGridPane, 0, 2);

        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton tailNumberRadioButton = new RadioButton();
        RadioButton maintFlagRadioButton = new RadioButton();
        RadioButton stationRadioButton = new RadioButton();
        tailNumberRadioButton.setToggleGroup(toggleGroup);
        maintFlagRadioButton.setToggleGroup(toggleGroup);
        stationRadioButton.setToggleGroup(toggleGroup);
        toggleGroup.selectToggle(tailNumberRadioButton);

        Label tailNumberLabel = new Label("Tail Number");
        Label maintFlagLabel = new Label("Maintenance Flag");
        Label stationLabel = new Label("AMO Station");

        TextField tailNumberTextField = new TextField();
        TextField maintFlagTextField = new TextField();
        TextField stationTextField = new TextField();

        Button searchButton = new Button("Search");

        searchGridPane.add(tailNumberRadioButton, 0, 0);
        searchGridPane.add(maintFlagRadioButton, 0, 1);
        searchGridPane.add(stationRadioButton, 0, 2);
        searchGridPane.add(tailNumberLabel, 1, 0);
        searchGridPane.add(maintFlagLabel, 1, 1);
        searchGridPane.add(stationLabel, 1, 2);
        searchGridPane.add(tailNumberTextField, 2, 0);
        searchGridPane.add(maintFlagTextField, 2, 1);
        searchGridPane.add(stationTextField, 2, 2);
        searchGridPane.add(searchButton, 0, 3);
        GridPane.setColumnSpan(searchButton, 3);
        GridPane.setHalignment(searchButton, HPos.CENTER);

        //Create aircraft table
        AircraftDAO aircraftDAO = new AircraftDAO();
        TableView<Aircraft> aircraftTableView;
        aircraftTableView = aircraftDAO.selectAllAircraft();
        outerGridPane.add(aircraftTableView, 0, 3);
        GridPane.setHgrow(aircraftTableView, Priority.ALWAYS);

        //Create bottom buttons
        HBox bottomButtonHBox = new HBox();
        bottomButtonHBox.setId("bottom-button-box");
        outerGridPane.add(bottomButtonHBox, 0, 4);
        Button aircraftOperationsButton = new Button("Aircraft Operations");
        Button aircraftMaintenanceButton = new Button("Aircraft Maintenance");
        Button addAircraftButton = new Button("Add Aircraft");
        Button modifyAircraftButton = new Button("Modify Aircraft");
        bottomButtonHBox.getChildren().addAll(
                aircraftOperationsButton, aircraftMaintenanceButton, addAircraftButton, modifyAircraftButton);
        //Action listener events
        aboutMenuItem.setOnAction((event) -> {
            System.out.println("About menu item pressed");
        });

        exitMenuItem.setOnAction((event) -> {
            System.out.println("Exit menu item pressed");
            System.exit(0);
        });

        searchButton.setOnAction((event) -> {
            System.out.println("Search Button Pressed");
        });

        Scene aircraftSearchScene = new Scene(borderPane, 1060, 850);
        aircraftSearchScene.getStylesheets().add(MainStage.class.getResource("FlightHours.css").toExternalForm());

        //vBox.getChildren().add(borderPane);
        primaryStage.setScene(aircraftSearchScene);
        primaryStage.show();
    }

    public static void run() {
        launch();
    }

}
