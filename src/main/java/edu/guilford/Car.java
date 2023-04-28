package edu.guilford;

public class Car {
   //attributes
private String make;
private String model;
private int year;
private double price;
private String color;
private String vin;
private String licensePlate;
private String owner;
private String ownerAddress;
private String ownerPhone;
private String ownerEmail;

//constructor

public Car(String make, String model, int year, double price, String color, String vin, String licensePlate, String owner, String ownerAddress, String ownerPhone, String ownerEmail){
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
    this.color = color;
    this.vin = vin;
    this.licensePlate = licensePlate;
    this.owner = owner;
    this.ownerAddress = ownerAddress;
    this.ownerPhone = ownerPhone;
    this.ownerEmail = ownerEmail;
}
//getters and setters
public String getMake(){
    return make;
}

public void setMake(String make){
    this.make = make;

}

public String getModel(){
    return model;
}

public void setModel(String model){
    this.model = model;
}

public int getYear(){
    return year;
}

public void setYear(int year){
    this.year = year;
}

public double getPrice(){
    return price;
}

public void setPrice(double price){
    this.price = price;
}

public String getColor(){
    return color;
}

public void setColor(String color){
    this.color = color;
}

public String getVin(){
    return vin;
}

public void setVin(String vin){
    this.vin = vin;
}

public String getLicensePlate(){
    return licensePlate;
}

public void setLicensePlate(String licensePlate){
    this.licensePlate = licensePlate;
}

public String getOwner(){
    return owner;
}

public void setOwner(String owner){
    this.owner = owner;
}


public String getOwnerAddress(){
    return ownerAddress;
}

public void setOwnerAddress(String ownerAddress){
    this.ownerAddress = ownerAddress;
}

public String getOwnerPhone(){
    return ownerPhone;
}

public void setOwnerPhone(String ownerPhone){
    this.ownerPhone = ownerPhone;
}

public String getOwnerEmail(){
    return ownerEmail;
}

public void setOwnerEmail(String ownerEmail){
    this.ownerEmail = ownerEmail;
}

//toString method
public String toString(){
    return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nPrice: " + price + "\nColor: " + color + "\nVin: " + vin + "\nLicense Plate: " + licensePlate + "\nOwner: " + owner + "\nOwner Address: " + ownerAddress + "\nOwner Phone: " + ownerPhone + "\nOwner Email: " + ownerEmail;
}

}

