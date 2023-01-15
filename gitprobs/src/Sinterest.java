import java.util.Scanner;

public class Sinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the principal amount: ");
        float p = in.nextFloat();
        System.out.println("enter the time period:");
        float n = in.nextFloat();
        System.out.println(" enter the number if years: ");
        float r = in.nextFloat();
        System.out.println("enter the rate of interest: ");

        float ans = (p*n*r)/100;
        System.out.println("the simple interest is :" + ans);


    }
}
