import java.util.Scanner;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the String: ");
        String a = in.nextLine();
        int length = a.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {

            reverse = reverse + a.charAt(i);
            if (a.equals(reverse)) {
                System.out.println("the string is a palindrome");
            } else {
                System.out.println("the sting is not a palindrome");
            }
        }


    }
}
