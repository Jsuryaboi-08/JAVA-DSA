import java.util.Scanner;

public class Cgpacalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of subjects ");
        int a = in.nextInt();
        int b = a;
        float d = 0;
        for (b = a; b > 0; b--) {
            System.out.println("enter the " + b + "cgpa");
            float c = in.nextFloat();
            if (c < 10) {
                d += c;
            } else {
                System.out.println("not a valid cgpa!!");
            }
            System.out.println(d);
        }
        float e = 0;
        e = d / a;
        System.out.println("your total cgpa is : " + e);
    }
}

