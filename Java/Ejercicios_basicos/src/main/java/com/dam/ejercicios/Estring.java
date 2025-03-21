package com.dam.ejercicios;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Estring {

    /**
     * Create a program called SortJoin that asks the user to enter
     * a list of names separated by whitespaces.
     * Then, the program must split the string, sort the names alphabetically
     * and output them separated by commas.
     * For instance, if the user types this name list:
     * Susan Kailey William John, then the program must output John, Kailey, Susan, William.
     */
    public static void SortJoin(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter a list of names:");
        String texto = entrada.nextLine();
        String [] parts = texto.split(" ");
        Arrays.sort(parts);
        for (int i = 0; i < parts.length; i++){
            System.out.print(parts[i] + ", ");
        }
    }

    /**
     * Create a program called CheckMessages that asks the user to type 10 strings.
     * The program must store them in an array, and then replace the text "Eclipse"
     * with "IntelliJ" in every string that contains "Eclipse".
     * The program must output the updated version of the strings stored in the array,
     * once the replacement has been done
     */
    public static void CheckMessages(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter 10 strings:");
        String texto = entrada.nextLine();
        String [] parts = texto.split(" ");
        for (int i = 0; i < parts.length; i++){
            String result = texto.replace("Eclipse", "IntelliJ");
            parts[i] = result;
        }
        for (int i = 0; i < parts.length; i++){
            System.out.print(parts[i]);
        }
    }

    /**
     *Create a program called LispChecker.
     *LISP is a programming languages where every instruction is enclosed in parentheses.
     * This could be a set of instructions in LISP:
     *You must implement a program that takes a string with
     * LISP instructions (just one string) and then
     * check if the parentheses are correct
     * (this is, the number of opening parentheses and closing parentheses are the same).
     */
    public static void LispChecker(String texto){

        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < texto.length(); i++) {
            String s = String.valueOf(texto.charAt(i));
            if (s.equals("(")) {
                counterA++;
            }
            if (s.equals(")")) {
                counterB++;
            }
        }

        if (counterA == counterB){
            System.out.println("The parentheses are correct");
        }
        else{
            System.out.println("The parentheses are not correct");
        }
    }
}
