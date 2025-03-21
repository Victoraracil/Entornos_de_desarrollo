package com.dam.ejercicios;

import java.util.Scanner;

public class Basicos {

    //Create a program called FormattedDate with a class with the same name inside.
// The program will ask the user to enter the day, month and year of birth (all values are integers).
// Then, it will print his birthdate with the format d/m/y.
// For instance, if the user types day = 7, month = 11, year = 1990, the program will output 7/11/1990.
    public static void formattedDate(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce your day");
        int day = (int)entrada.nextLong();

        System.out.println("Introduce your month");
        int month = (int)entrada.nextLong();

        System.out.println("Introduce your month");
        int year = (int)entrada.nextLong();

        System.out.println(day + " / " + month +  " / " + year);
    }

    //Create a program called GramOunceConverter that converts from grams to ounces.
// The program will ask the user to enter a weight in grams (an integer number),
// and then it will show the corresponding weight in ounces (a real number),
// taking into account that 1 ounce = 28.3495 grams.
    public static void GramOunceConverter() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter a weight in grams");
        int weight = (int)entrada.nextLong();

        float grams = (float) 28.3495;
        float ounce = weight / grams;

        System.out.println(weight + " grams are " + ounce + " ounces");

    }

    //Create a program called NumbersStrings.
// This program must ask the user to enter 4 numbers, that will be stored in 4 String variables.
// Then, the program will join the first pair of numbers into a single integer value,
// and the second pair of numbers into another integer value, and then add these values.
// For instance, if the user types the numbers 23, 11, 45 and 112,
// then the program will create a first integer value of 2311 and a second integer value of 45112.
// Then, it will add these two values and get a final result of 47423.
    public static void NumbersStrings() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter the first number");
        String text = entrada.nextLine();

        System.out.println("Enter the second number");
        String text2 = entrada.nextLine();
        int number = Integer.parseInt(text + text2);

        System.out.println("Enter the third number");
        String text3 = entrada.nextLine();

        System.out.println("Enter the forth number");
        String text4 = entrada.nextLine();
        int number1 = Integer.parseInt(text3 + text4);

        number += number1;

        System.out.println(number);

    }

    //Create a program called CircleArea that defines a float constant called PI with the value 3.14159.
// Then, the program will ask the user to enter the radius of a circle,
// and it will output the area of the circle (PI * radius * radius).
// This area will be printed with two decimal digits.
    public static void CircleArea() {
        float PI = 3.14159F;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        int radius = entrada.nextInt();

        float area = (float) (PI * Math.pow(radius,2));

        System.out.printf("The area of the circle is: %3.2f ", area);

    }
}
