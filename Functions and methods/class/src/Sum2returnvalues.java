import java.util.Scanner;

public class Sum2returnvalues {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum (){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("enter the second number: ");
        int num2 = in.nextInt();
        int sum2 = num1+num2;
        return sum2;
    }
}
