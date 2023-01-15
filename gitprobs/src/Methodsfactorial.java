import java.util.Scanner;

public class Methodsfactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to get the factorial:");
        int a = in.nextInt();
        if (a==1||a==0){
            System.out.println(1);
        }else {
        int b = factorial(a);
        System.out.println(b);}


    }

    static int factorial(int a) {
        int b = 1;
        int c = 1;
        for (b=1;b<=a;b++){
            c=c*b;

        }
        return c;
    }
}
