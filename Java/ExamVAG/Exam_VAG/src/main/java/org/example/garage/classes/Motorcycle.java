package org.example.garage.classes;

/**
 *For each vehicle we will store the following information:
 * • Licence plate*
 * • Brand (Toyota, Honda, Ford, Kia, etc.)
 * • Model (Verso, Africa, Focus, Kuga, etc.)
 * • Color
 * Motorcycles will have a field to save the cylinder capacity (e.g. 125 cc, 250 cc, etc.).
 */
class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(String licensePlate, String brand, String model, String color, int cylinderCapacity) {//Builder
        super(licensePlate, brand, model, color);
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cylinder Capacity: " + cylinderCapacity + "cc";
    }
}