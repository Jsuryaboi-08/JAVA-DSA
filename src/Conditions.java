import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /* if statement
         */
        Scanner in = new Scanner(System.in);
        float salary = in.nextFloat();
        if (salary>=10000){
            salary=salary+2000;

        } else if (salary>5000) {
            salary+=500;

        }else
        {
            salary = salary+1000;

        }
        System.out.println(salary);

    }
}
