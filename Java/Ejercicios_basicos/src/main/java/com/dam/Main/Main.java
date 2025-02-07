package com.dam.Main;

import com.dam.ejercicios.*;

import javax.naming.ldap.Control;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        //Basicos.formattedDate();
        //Basicos.GramOunceConverter();
        //Basicos.NumbersStrings();
        //Basicos.CircleArea();
        //Control_Structures.Triangle();
        //Control_Structures.GroupPeople();

        // Array of 4 numbers
        //Static_data_types.Element_Found(numbers);
        //Static_data_types.Array_Counter(numbers);
        //Static_data_types.Array_Sort(numbers);
        //Static_data_types.MatrixAddition();
        //Static_data_types.MonthEnum();
        //Estring.SortJoin();
        //Estring.CheckMessages();
        //String texto = "(let (new (x-point a y))))";
        //Estring.LispChecker(texto);
        //System.out.println("Enter a cardID (4digits and 3 upper letters)");
        //String text = entrada.nextLine();
        //Regular_expressions.CarIDCheck(text);
        //Regular_expressions.EmailChecker();
        String text = "Too hot to hoot ";
        Functions.isPalindrome(text);
    }
}