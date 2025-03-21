package org.example.garage.main;

import org.example.garage.classes.Menu;

/**
 * You must implement the following specification in an lntelliJ project called Garage.
 * Create a package called garage.main for the main class,
 * and another one called garage.classes for the classes and a garage.utils package
 * if you separate independent methods.
 *
 * We must implement an application to manage a garage where
 * two vehicle types (cars and motorcycles) can be repaired.
 * You must create a parent, abstract class to represent any kind of vehicle,
 * and then the corresponding subclasses for each type (either car or motorcycle).
 *
 * For each vehicle we will store the following information:
 * • Licence plate*
 * • Brand (Toyota, Honda, Ford, Kia, etc.)
 * • Model (Verso, Africa, Focus, Kuga, etc.)
 * • Color
 *
 * *You must control in the corresponding setter that each license plate is
 * exactly 7 characters in length, starting with 4 numbers and finishing with 3 letters.
 * Otherwise, the vehicle and repair order with wrong data will be discarded.
 *
 * Cars will have the type of fuel (either diesel or gasoline).
 * Motorcycles will have a field to save the cylinder capacity (e.g. 125 cc, 250 cc, etc.).
 *
 * We will have a HashMap where the key will be the license plate of a vehicle and the value
 * will be an object containing all the data related to each repair order.
 * We must also have a list containing all the replacement parts available in the garage
 *
 * For each repair order we will store the following data:
 * • All data related to the vehicle to be fixed. A vehicle can have 0..1 Repair orders.
 * • Description of the problem provided by the customer.
 * • List of replacement parts used to fix the vehicle. A repair order can have 1..NReplacement parts.
 * • Number of working hours used to have the vehicle fixed.
 *
 *
 *
 * You must define the constructors of each class to set every attribute, and also every getter and setter.
 * You should also add any other method that can be useful (such as overriding toString methods).
 *
 * After starting the application, the user must be shown a menu with the following options:
 * 1. Add a new repair order, where all data of the vehicle must be provided, together with the description
 * of what is the problem to be fixed.
 * 2. List of all replacement parts available in the garage, ordered alphabetically.
 * 3. Modify a specific repair order, which may consist of adding new replacement parts or also adding working hours).
 * 1. You will have to list all the repair orders so that the user may see the license plates of the
 * vehicles being repaired and select the desired one.
 * 2. Then the user should select what to change whether replacement parts or working hours.
 * If they need to add replacement parts you may want them to select from the list, or add a new one.
 * 4. Deliver a vehicle (calculate the total amount to be paid by the customer, depending on the individual prices
 * of the replacement parts, and the working hours).
 * 1. This can be done in the following way: Sum of prices of all replacement parts + (working hours
 * * 50) in EUR.
 * 5. Exit application.
 *
 * Remember that "bad code" will be penalized (variable, class or method names, incorrect vertical
 * or horizontal spacing, unnecessarily large methoJi§_, duplicated code, main class cleanness,
 * Javadoc and comments...)
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.ShowMenu();
    }
}