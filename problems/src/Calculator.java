import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float ans = 0;

        // making a infinite loop:
        while (true) {
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // taking input of two numbers
                float num1 = in.nextInt();
                float num2 = in.nextInt();
                while (op == '+') {
                    ans = num1 + num2;
                    System.out.println(ans);
                }
                while (op == '-') {
                    ans = num1 - num2;
                    System.out.println(ans);
                }
                while (op == '*') {
                    ans = num1 * num2;
                    System.out.println(ans);
                }
                while (op == '/') {
                    ans = num1 / num2;
                    System.out.println(ans);
                }
                while (op == '%') {
                    ans = num1 % num2;
                    System.out.println(ans);
                }
                System.out.println(ans);

            } else if (op=='x' || op=='X') {
                break;

            }else {
                System.out.println(" the Input is invalid");
            }

        }
    }
}
