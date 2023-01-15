import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name:");

        String a = in.nextLine();


        System.out.println("welcome " + a);
    }


}
