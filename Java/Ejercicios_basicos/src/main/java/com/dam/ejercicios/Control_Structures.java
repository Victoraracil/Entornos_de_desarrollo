package com.dam.ejercicios;

import java.util.Scanner;

public class Control_Structures {

    /**
     * Create a program called GroupPeople that asks the user to enter how
     * many people is going to attend to a conference.
     * The program must create groups of (preferably) 50 people.
     * Whenever this is not possible, then it will attempt to create groups
     * of 10 people, and finally it will create groups of 1 person.
     * The program must output how many groups of each category are necessary.
     * For instance, if 78 people are going to attend to the conference,
     * then we need 1 group of 50 people, 2 groups of 10 people and 8 groups of 1 people.
     */

    public static void GroupPeople(){
        int group50 = 0;
        int group10 = 0;
        int group1 = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("How many people is going to attend to a conference");
        int people = entrada.nextInt();

        if (people > 0) {
            while (people >= 50) {
                group50++;
                people -= 50;
            }
            while (people >= 10) {
                group10++;
                people -= 10;
            }
            while (people >= 1) {
                group1++;
                people -= 1;
            }
        }
        System.out.println("Groups os 50: " + group50);
        System.out.println("Groups os 10: " + group10);
        System.out.println("Groups os 1: " + group1);
    }


    /**
     *  Write a program called Triangle in which we ask a user to enter
     *  a height (integer) and then we write a reversed triangle like
     *  the following one (assuming a height of 5):
     */
    public static void Triangle(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter the size of the triangle");
        int size = entrada.nextInt();

        for (int i = 1; i <= size; i++)
        {
            for (int j = 1 - 1 + i; j <= size; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (int z = 0; z != i; z++){
                System.out.print(" ");
            }
        }
    }
}
