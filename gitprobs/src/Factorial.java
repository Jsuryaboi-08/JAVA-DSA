import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value upto which u want to factorial: ");
        int a = in.nextInt();
        int b = 1;
        int c = 1;
        for (b=1;b<=a;++b){
            c=c*b;
        }
        System.out.println(c);

    }
}
