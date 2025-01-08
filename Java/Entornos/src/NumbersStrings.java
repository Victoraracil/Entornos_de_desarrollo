import java.util.Scanner;
//Create a program called NumbersStrings.
// This program must ask the user to enter 4 numbers, that will be stored in 4 String variables.
// Then, the program will join the first pair of numbers into a single integer value,
// and the second pair of numbers into another integer value, and then add these values.
// For instance, if the user types the numbers 23, 11, 45 and 112,
// then the program will create a first integer value of 2311 and a second integer value of 45112.
// Then, it will add these two values and get a final result of 47423.
public class NumbersStrings {
    public static void main(String[] args) {
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
}
