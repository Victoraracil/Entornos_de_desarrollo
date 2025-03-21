package org.example.garage.classes;

/**
 *For each vehicle we will store the following information:
 * • Licence plate*
 * • Brand (Toyota, Honda, Ford, Kia, etc.)
 * • Model (Verso, Africa, Focus, Kuga, etc.)
 * • Color
 * Cars will have the type of fuel (either diesel or gasoline).
 */
class Car extends Vehicle {
    private String fuelType;

    public Car(String licensePlate, String brand, String model, String color, String fuelType) {//Builder
        super(licensePlate, brand, model, color);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " - Fuel: " + fuelType;
    }
}
