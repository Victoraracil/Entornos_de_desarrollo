package com.dam.ejercicios;

public class Static_data_types {
    public static void Element_Found(){

        int[] numbers = {1, 25, 33, 15};       // Array of 4 numbers
        boolean found = false;
        int i = 0;
        while (!found && i < numbers.length)
        {
            if (numbers[i] == 15)
            {
                found = true;
            }
            else
            {
                i++;
            }
        }

        if (found)
        {
            System.out.println("Number found at position " + i);
        }
        else
        {
            System.out.println("Number not found");
        }

    }
}
