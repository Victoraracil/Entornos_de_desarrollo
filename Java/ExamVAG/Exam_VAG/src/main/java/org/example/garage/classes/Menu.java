package org.example.garage.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * After starting the application, the user must be shown a menu with the following options:
 * 1. Add a new repair order, where all data of the vehicle must be provided, together with the description
 * of what is the problem to be fixed.
 * 2. List of all replacement parts available in the garage, ordered alphabetically.
 * 3. Modify a specific repair order, which may consist of adding new replacement parts or also adding working hours).
 *      1. You will have to list all the repair orders so that the user may see the license plates of the
 *      vehicles being repaired and select the desired one.
 *      2. Then the user should select what to change whether replacement parts or working hours.
 *      If they need to add replacement parts you may want them to select from the list, or add a new one.
 * 4. Deliver a vehicle (calculate the total amount to be paid by the customer, depending on the individual prices
 * of the replacement parts, and the working hours).
 *      1. This can be done in the following way: Sum of prices of all replacement parts + (working hours
 *      * 50) in EUR.
 * 5. Exit application
 */
public class Menu {
    Scanner entrada = new Scanner(System.in);
    public void ShowMenu() {

            int option = 0;
            do {

                System.out.println("1.- Add a new repair order.");
                System.out.println("2.- List all replacement parts available.");
                System.out.println("3.- Modify a repair order.");
                System.out.println("4.- Deliver a vehicle.");
                System.out.println("5.- Exit.");

                try{
                    option = entrada.nextInt();

                }catch(InputMismatchException e){
                    System.out.println("You can only write numbers");
                    entrada.nextLine();
                    ShowMenu();

                }catch(NumberFormatException e){
                    System.out.println("Write a valid number");
                    entrada.nextLine();
                    ShowMenu();
                }
                catch(Exception e){
                    System.out.println("Unknown error, make sure yo only write numbers");
                    entrada.nextLine();
                    ShowMenu();
                }




                switch (option) {
                    case 1:
                        System.out.println("addOrder();");
                        break;
                    case 2:
                        System.out.println("listAllReplacements();");
                        break;
                    case 3:
                        System.out.println("modifyOrder();");
                        break;
                    case 4:
                        System.out.println("deliverVehicle();");
                        break;
                    case 5:
                        System.out.println("Saliendo Del Programa...");
                        option = 0;
                        break;
                }
            }while(option != 0);
        }
}

