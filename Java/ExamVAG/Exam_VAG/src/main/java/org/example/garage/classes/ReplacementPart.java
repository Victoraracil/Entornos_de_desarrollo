package org.example.garage.classes;

/**
 * For each replacement part we need to know the following information:
 * • Name (e.g. antenna, battery, radiator, sunroof glass, tyre, etc.).
 * • Price.
 */

class ReplacementPart {
    private String name;
    private double price;

    public ReplacementPart(String name, double price) { //Builder
        this.name = name;
        this.price = price;
    }

    //Getters
    public String getName() { return name; }
    public double getPrice() { return price; }

    //Setters
    public void setPrice(double price) { this.price = price; }
    public void setName(String name) {this.name = name; }

    //ToString
    @Override
    public String toString() {
        return name + " - " + price + " EUR";
    }
}
