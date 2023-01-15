import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the year which you would wanna check for leap year or not: ");
        int a = in.nextInt();
        int b = 0;
        b = a % 4;
        if (b == 0) {
            System.out.println("this is a leap year");

        } else {
            System.out.println("this isnt a leap year");

        }

    }
}
