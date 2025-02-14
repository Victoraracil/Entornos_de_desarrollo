package com.dam.ejercicios;

import java.util.Scanner;

public class Error_handling {
    public static void a() throws InterruptedException
    {
        throw new InterruptedException ("Exception in a");
    }

    public static void b() throws InterruptedException
    {
        a();
    }

    public static void c() throws InterruptedException
    {
        b();
    }

    public static void d() throws InterruptedException
    {
        c();
    }

    /**
     * Create a program called CalculateDensity that asks the user to type a weight (in grams)
     * and a volume (in liters). Then, the program must output the density, which is calculated
     * by dividing weight / volume. The program must catch every type of possible exception:
     * NumberFormatException and ArithmeticException whenever they can be thrown.
     * You can only use Scanner.nextLine method to get the user input in this exercise
     */
    public static void CalculateDensity(){

        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Introduce the weight");
            String weight = entrada.nextLine();

            System.out.println("Introduce the volume");
            String volume = entrada.nextLine();
            try{
                int Weight = Integer.parseInt(weight);
                int Volume = Integer.parseInt(volume);
            }catch (NumberFormatException ArithmeticException){
                System.out.println("Introduce a number");
            }
        }



    }

}
