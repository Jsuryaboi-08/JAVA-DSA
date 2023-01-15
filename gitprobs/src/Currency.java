import java.awt.*;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the $ or r as a conversion symbol");
        char a = in.nextLine().charAt(0);

        if (a == '$'){
            System.out.println(" you have chosen dollars: "+" ");
            System.out.println(" Enter the amount to be converted into rupees");
            double b = in.nextFloat();
            b = b*82.6;
            System.out.println("the rupees: " + b);
        } else if (a == 'r') {
            System.out.println( " you have chosen rupees: "+ " ");
            System.out.println(" Enter the amount to be converted into dollars");
            double c = in.nextFloat();
            c= c/82.6;
            System.out.println("the amount is: " + c);
        }else {
            System.out.println("invalid operation!!");
        }

    }
}
