import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    /*
     Syntax for loops:
     for(intiialisation; conditon; ncrement/decrement){
     //body
     }
     */
//        for (int num1 = 1; num1 <= 5; num1 += 2){
//            System.out.println(num1);
//        }
//
//        Scanner in = new Scanner(System.in);
//        int num2 = in.nextInt();

//        for (int num1 = num2-1; num1 >=0 ; num1--) {
//            System.out.println(num1 + " ");
//        }
        /*
            Syntax for while loops:
            intialisation;
            while(condition){
            body
            }

             */
//        int num =1;
//        while(num<=5){
//            System.out.println(num);
//            num +=1;
//        }

        /*
        do while loop syntax:


        do{
                   // body
                   }while (condition);
         */
        int num =1;
        do {
            System.out.println(num);
            num+=1;
        }while (num<=5);
    }
}
