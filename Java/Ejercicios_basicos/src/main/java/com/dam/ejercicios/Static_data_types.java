package com.dam.ejercicios;

import java.util.Scanner;

public class Static_data_types {
    /**
     *
     */
    public static void Element_Found(int[] numbers){

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
    public static void Array_Counter(int [] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 15)
            {
                counter++;
            }
        }

        System.out.print("Number 15 has been found " + counter + " times");

    }
    public static void Array_Sort(int [] numbers){
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length - i - 1; j++)
            {
                if (numbers[j] > numbers[j+1])
                {
                    int aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }

    /**
     * Create a program called MatrixAddition that asks
     * the user to enter two bidimensional matrices or
     * tables of 3 rows and columns, and then prints
     * the result of adding them.
     * In order to add two matrices, you must do it cell by cell
     */
    public static void MatrixAddition(){

        int[][] result = new int[3][3];
        int[][] numbers = new int[3][3];
        int[][] numbers2 = new int[3][3];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("Insert the " + (i + 1) + " " + (j + 1) + " number");
                numbers[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < numbers2.length; i++){
            for (int j = 0; j < numbers2.length; j++) {
                System.out.println("Insert the " + (i) + " " + (j) + " number");
                numbers2[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result.length; j++) {
                result[i][j] = numbers[i][j] + numbers2[i][j];
            }
        }

        for (int i = 0; i < result.length; i++){
            System.out.print("| ");
            for (int j = 0; j < result.length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("|");
        }
    }
    public static void MonthEnum(){
        enum monthYear {
            January, February, March, April, May, June, July, August,
            September, October, November, December
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month of the year by a number:");
        monthYear aMonth = monthYear.valueOf(sc.nextLine());
        String [] months31 = new String; {January, March, May, July, August, October, December};


        System.out.println(aMonth + " have " + days + " days.");




    }
}
