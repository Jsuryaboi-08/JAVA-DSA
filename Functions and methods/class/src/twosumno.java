import java.util.Scanner;

public class twosumno {
    public static void main(String[] args) {
        // Q: take input of two number and print the sum:
        /*
        access modifier(well look in OOPS) return_type name() {
        // body
        return statement;
        }
         */
        sum();
    }
    static void sum (){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("enter the first number:");
        num1= in.nextInt();;
        System.out.println("enter the second number:");
        num2 = in.nextInt();;
        sum = num1+num2;
        System.out.println(sum);

    }
}
