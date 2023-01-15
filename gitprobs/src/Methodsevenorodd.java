import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Methodsevenorodd {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a<=0){
            System.out.println("enter a valid number");
        }else {
            evenorodd(a);
        }
    }

    private static void evenorodd(int a) {
        int b = a%2;
        if(b==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
