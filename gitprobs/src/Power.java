import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int a = in.nextInt();
        System.out.println("enter the power");
        int b = in.nextInt();
        long c =1;
        int d = b;
        while(d!=0) {
            c *= a;
            d--;
        }
        System.out.println(c);
    }
}
