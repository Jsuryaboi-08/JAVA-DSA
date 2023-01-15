import java.util.Scanner;

public class Methodprimenumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = in.nextInt();
        if(a<=0) {
            System.out.println("enter a valid number");
        }else {
            Prime(a);
        }
    }

    private static void Prime(int a) {
        int c = 2;
        while (c*c<=a){
            if (a%c==0) {
                System.out.println("not prime");
            }c++;
            if(c*c>a){
                System.out.println("prime");
            }else {
                System.out.println("not prime");
            }
        }
    }
}
