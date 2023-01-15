import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b&a>c){
            System.out.println("The largest number is A =" +a);

        } else if (b>a&b>c) {
            System.out.println("The largest number is B ="+b);


        } else if (c>a&c>b) {
            System.out.println("The largest number is C ="+c);

        } else if (a==c&a==b) {
            System.out.println("All the numbers are equal");

        }
    }
}
