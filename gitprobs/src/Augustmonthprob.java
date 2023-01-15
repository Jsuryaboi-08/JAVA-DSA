import java.util.Scanner;

public class Augustmonthprob {
    public static void main(String[] args) {
        Scanner in =   new Scanner(System.in);
        System.out.println("tis programme calculates the number of days in the august moth when kunal can go out");
        int a = 0;
        int b = 0;
        while (a<=31){
            b = a%2;
            a++;
            if(b==0){
                System.out.println("he can go out this day " +a);
            }else {
                System.out.println("he cant go out this day"+a);
            }
        }
    }
}
