import java.util.Scanner;
//Create a program called FormattedDate with a class with the same name inside.
// The program will ask the user to enter the day, month and year of birth (all values are integers).
// Then, it will print his birth date with the format d/m/y.
// For instance, if the user types day = 7, month = 11, year = 1990, the program will output 7/11/1990.
public class FormattedDate {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce your day");
        int day = (int)entrada.nextLong();

        System.out.println("Introduce your month");
        int month = (int)entrada.nextLong();

        System.out.println("Introduce your month");
        int year = (int)entrada.nextLong();

        System.out.println(day + " / " + month +  " / " + year);
    }
}
