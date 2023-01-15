import java.util.Scanner;

public class Factorsofnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = in.nextInt();
        System.out.println("these are the factors of the given number:");
        int c = 0;
        int b = 1;
        for(b=1;b<=a;b++){
            if (a%b==0){
                System.out.println(b+"");
            }

        }
    }
}
