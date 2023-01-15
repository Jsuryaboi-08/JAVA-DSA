import java.util.Scanner;

public class Arithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" enter the operator of the operation to be performed");
        char a = in.nextLine().trim().charAt(0);
        System.out.println(" enter the first number:");
        int num1 = in.nextInt();
        System.out.println(" enter the second number:");
        int num2 = in.nextInt();
        if (a == '+'){
            int num3 = num1+num2;
            System.out.println(num3);
        } else if (a == '-') {
            int num3 = num1-num2;
            System.out.println(num3);
        } else if (a == '*') {
            int num3 = num1 * num2;
            System.out.println(num3);
        } else if (a == '/') {
            int num3 = num1/num2;
            System.out.println(num3);
        }else{
            System.out.println("Invalid operator!!");
        }
    }
}
