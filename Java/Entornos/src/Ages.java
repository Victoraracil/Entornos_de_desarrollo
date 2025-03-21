//Defines two byte variables to store your age and the age of a friend
//Defines another byte variable to store the addition of both ages (you may need to typecast the result)
//Defines a float variable to store the average of these ages, including fraction digits
//Prints the message "The age average is " followed by the average calculated in previous step
import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce your age");
        byte age1 = (byte)entrada.nextLong();

        System.out.println("Introduce your friend's age");
        byte age2 = (byte)entrada.nextLong();

        byte agerest = (byte) (age1 + age2);
        float average = (float) (agerest / 2);
        System.out.println("The age average is " + average);
    }
}
