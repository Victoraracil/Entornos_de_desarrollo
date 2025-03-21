package org.example.garage.classes;

/**
 * For each vehicle we will store the following information:
 * • Licence plate*
 * • Brand (Toyota, Honda, Ford, Kia, etc.)
 * • Model (Verso, Africa, Focus, Kuga, etc.)
 * • Color
 */
abstract class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected String model;
    protected String color;

    public Vehicle(String licensePlate, String brand, String model, String color) { //Builder
        if (!licensePlate.matches("\\d{4}[A-Z]{3}")) {//Checking the plate is correct
            throw new IllegalArgumentException("Invalid license plate format. Must be 4 numbers followed by 3 letters.");
        }
        else{
            this.licensePlate = licensePlate;
            this.brand = brand;
            this.model = model;
            this.color = color;
        }

    }

    //Getters
    public String getLicensePlate() { return licensePlate; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return brand + " " + model + " (" + color + ") - " + licensePlate;
    }
}
