package edu.guilford;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CarPane extends GridPane {
//add the car attribute
private Car car;
//add the labels attributes
private Label makeLabel;
private Label modelLabel;
private Label yearLabel;
private Label priceLabel;
private Label colorLabel;
private Label vinLabel;
private Label licensePlateLabel;
private Label ownerLabel;
private Label ownerAddressLabel;
private Label ownerPhoneLabel;
private Label ownerEmailLabel;
private Label priceErrorLabel;
private Label yearErrorLabel;
private Label makeErrorLabel;
private Label ownerPhoneErrorLabel;

//add the text fields attributes
private TextField makeTextField;
private TextField modelTextField;
private TextField yearTextField;
private TextField priceTextField;
private TextField colorTextField;
private TextField vinTextField;
private TextField licensePlateTextField;
private TextField ownerTextField;
private TextField ownerAddressTextField;
private TextField ownerPhoneTextField;
private TextField ownerEmailTextField;

//add the buttons attributes
private Button addButton;
//add the buttons attributes
private Button ColorButton;
//add imageview attribute
private ImageView imageView;

//constructor
public CarPane(Car car){
    //instantiate the car
    //car = new Car("Ford", "Mustang", 2019, 25000.00, "red", "123456789", "ABC123", "John Doe", "123 Main St", "555-555-5555", "jdoe@guilford.edu");
    this.car = car;
    // //set the background color
    // this.setStyle("-fx-background-color: #FFFFFF;");
    // //set the background image
    // this.setBackground(new Background(new BackgroundImage(new Image("Zugspitze.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));

//get the image
File file = new File(getClass().getResource("Germany.jpg").getPath());
//instantiate the imageview
imageView = new ImageView(file.toURI().toString());
//set the size of the image
imageView.setFitHeight(200);
imageView.setFitWidth(200);
//instatiate Colorbutton
ColorButton = new Button("Change Color");

//set the image as a background image
// this.setBackground(new Background(new BackgroundImage(imageView.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
// BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO , BackgroundSize.AUTO, false, false, true, false);
// this.setBackground(new Background(new BackgroundImage(imageView.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size)));

    //instantiate the labels
    makeLabel = new Label("Make: "+car.getMake());
    modelLabel = new Label("Model: "+car.getModel());
    yearLabel = new Label("Year: "+car.getYear());
    priceLabel = new Label("Price: "+car.getPrice());
    colorLabel = new Label("Color: "+car.getColor());
    vinLabel = new Label("VIN: "+car.getVin());
    licensePlateLabel = new Label("License Plate: "+car.getLicensePlate());
    ownerLabel = new Label("Owner: "+car.getOwner());
    ownerAddressLabel = new Label("Owner Address: "+car.getOwnerAddress());
    ownerPhoneLabel = new Label("Owner Phone: "+car.getOwnerPhone());
    ownerEmailLabel = new Label("Owner Email: "+car.getOwnerEmail());
    priceErrorLabel = new Label("");
    yearErrorLabel = new Label("");
    makeErrorLabel = new Label("");
    ownerPhoneErrorLabel = new Label("");


    //instantiate the text fields
    makeTextField = new TextField();
    modelTextField = new TextField();
    yearTextField = new TextField();
    priceTextField = new TextField();
    colorTextField = new TextField();
    vinTextField = new TextField();
    licensePlateTextField = new TextField();
    ownerTextField = new TextField();
    ownerAddressTextField = new TextField();
    ownerPhoneTextField = new TextField();
    ownerEmailTextField = new TextField();

    //set the text fields to the car attributes
    makeTextField.setText(car.getMake());
    modelTextField.setText(car.getModel());
    yearTextField.setText(Integer.toString(car.getYear()));
    priceTextField.setText(Double.toString(car.getPrice()));
    colorTextField.setText(car.getColor());
    vinTextField.setText(car.getVin());
    licensePlateTextField.setText(car.getLicensePlate());
    ownerTextField.setText(car.getOwner());
    ownerAddressTextField.setText(car.getOwnerAddress());
    ownerPhoneTextField.setText(car.getOwnerPhone());
    ownerEmailTextField.setText(car.getOwnerEmail());


    //instantiate the buttons
    addButton = new Button("Submit");

    //add the labels to the pane
    this.add(makeLabel, 0, 0);
    this.add(modelLabel, 0, 1);
    this.add(yearLabel, 0, 2);
    this.add(priceLabel, 0, 3);
    this.add(colorLabel, 0, 4);
    this.add(vinLabel, 0, 5);
    this.add(licensePlateLabel, 0, 6);
    this.add(ownerLabel, 0, 7);
    this.add(ownerAddressLabel, 0, 8);
    this.add(ownerPhoneLabel, 0, 9);
    this.add(ownerEmailLabel, 0, 10);
    this.add(priceErrorLabel, 2, 3);
    this.add(yearErrorLabel, 2, 2);
    this.add(makeErrorLabel, 2, 0);
    this.add(ownerPhoneErrorLabel, 2, 9);


    //add the text fields to the pane
    this.add(makeTextField, 1, 0);
    this.add(modelTextField, 1, 1);
    this.add(yearTextField, 1, 2);
    this.add(priceTextField, 1, 3);
    this.add(colorTextField, 1, 4);
    this.add(vinTextField, 1, 5);
    this.add(licensePlateTextField, 1, 6);
    this.add(ownerTextField, 1, 7);
    this.add(ownerAddressTextField, 1, 8);
    this.add(ownerPhoneTextField, 1, 9);
    this.add(ownerEmailTextField, 1, 10);

    //add the imageview to the pane next to the text fields
    this.add(imageView, 2, 0, 1, 11);

    //add the button to the pane
    this.add(addButton, 1, 11);

    //set the gap between the rows and columns
    this.setHgap(10);
    this.setVgap(10);
    //Add color button to the pane
    this.add(ColorButton, 2, 11);

   //add a listener that will update the car object when the button is clicked
    addButton.setOnAction(e -> {
         //update the car object

         //add a try catch block to validate the make so no integers are entered
            try{
                car.setMake(makeTextField.getText());
                makeLabel.setText("Make: "+car.getMake());
                makeLabel.setStyle("-fx-text-fill: black;");
            }catch(NumberFormatException ex){
                //  System.out.println("Invalid make");
                makeErrorLabel.setText("Invalid make");
                makeErrorLabel.setStyle("-fx-text-fill: red;");
                }
         car.setMake(makeTextField.getText());

         car.setModel(modelTextField.getText());

         //add a try catch block to validate the year entered as an integer in 4 digits
            try{
                car.setYear(Integer.parseInt(yearTextField.getText()));
                yearErrorLabel.setText("");
            }catch(NumberFormatException ex){
                //  System.out.println("Invalid year");
                yearErrorLabel.setText("Invalid year");
                yearErrorLabel.setStyle("-fx-text-fill: red;");
                
                }


         car.setYear(Integer.parseInt(yearTextField.getText()));

         //add a try catch block to validate the price
            try{
                car.setPrice(Double.parseDouble(priceTextField.getText()));
            }catch(NumberFormatException ex){
              //  System.out.println("Invalid price");
              priceErrorLabel.setText("Invalid price");
              priceErrorLabel.setStyle("-fx-text-fill: red;");
              
            }

         //car.setPrice(Double.parseDouble(priceTextField.getText()));
         car.setColor(colorTextField.getText());
         car.setVin(vinTextField.getText());
         car.setLicensePlate(licensePlateTextField.getText());
         car.setOwner(ownerTextField.getText());
         car.setOwnerAddress(ownerAddressTextField.getText());
         //add a try catch block to catch the exception if the phone number is not entered correctly
            try{
                car.setOwnerPhone(ownerPhoneTextField.getText());
            }catch(NumberFormatException ex){
                //  System.out.println("Invalid phone number");
                ownerPhoneErrorLabel.setText("Invalid phone number");
                ownerPhoneErrorLabel.setStyle("-fx-text-fill: red;");
                }
               
         car.setOwnerPhone(ownerPhoneTextField.getText());
         car.setOwnerEmail(ownerEmailTextField.getText());
    
         //update the labels
         makeLabel.setText("Make: "+car.getMake());
         modelLabel.setText("Model: "+car.getModel());
         yearLabel.setText("Year: "+car.getYear());
         priceLabel.setText("Price: "+car.getPrice());
         colorLabel.setText("Color: "+car.getColor());
         vinLabel.setText("VIN: "+car.getVin());
         licensePlateLabel.setText("License Plate: "+car.getLicensePlate());
         ownerLabel.setText("Owner: "+car.getOwner());
         ownerAddressLabel.setText("Owner Address: "+car.getOwnerAddress());
         ownerPhoneLabel.setText("Owner Phone: "+car.getOwnerPhone());
         ownerEmailLabel.setText("Owner Email: "+car.getOwnerEmail());
    
    });
    
    //Add a listener to the ColorButton that will set the background color to the color entered in the colorTextField
    ColorButton.setOnAction(e -> {
        //set the background color
        this.setStyle("-fx-background-color: "+colorTextField.getText()+";");
    });
//Instanite the exception class
class NumberFormatException extends Exception{
    //constructor
    public NumberFormatException(String message){
        super(message);
    }


}


}
    
    }
