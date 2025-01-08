import java.util.Scanner;

//Create a program called CircleArea that defines a float constant called PI with the value 3.14159.
// Then, the program will ask the user to enter the radius of a circle,
// and it will output the area of the circle (PI * radius * radius).
// This area will be printed with two decimal digits.
public class CircleArea {
    public static void main(String[] args) {
        float PI = 3.14159F;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        int radius = entrada.nextInt();

        float area = PI * radius * radius;

        System.out.printf("The area of the circle is: %3.2f ", area);

    }
}
