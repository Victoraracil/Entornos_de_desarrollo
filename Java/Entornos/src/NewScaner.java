import java.util.Scanner;

public class NewScaner {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String text = sc.nextLine();
        sc.close();
    }
}
