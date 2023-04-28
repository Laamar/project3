package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Driver extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //instaintiate the VBox
         VBox root = new VBox();
        // Add VBox to the scene
        scene = new Scene(root, 800, 650);
        //instantiate a new car object
        Car car = new Car("Ford", "Mustang", 2019, 25000.00, "red", "123456789", "ABC123", "John Doe", "123 Main St", "555-555-5555", "jdoe@guilford.edu");
        //add the carPane to the VBox root 
        root.getChildren().add(new CarPane(car));

       
        //set the title of the stage
        stage.setTitle("Car");




            
       // scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }

}