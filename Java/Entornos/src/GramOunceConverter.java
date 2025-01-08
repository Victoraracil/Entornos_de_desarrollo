import java.util.Scanner;
//Create a program called GramOunceConverter that converts from grams to ounces.
// The program will ask the user to enter a weight in grams (an integer number),
// and then it will show the corresponding weight in ounces (a real number),
// taking into account that 1 ounce = 28.3495 grams.
public class GramOunceConverter {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter a weight in grams");
        int weight = (int)entrada.nextLong();

        float grams = (float) 28.3495;
        float ounce = weight / grams;

        System.out.println(weight + " grams are " + ounce + " ounces");

    }
}
