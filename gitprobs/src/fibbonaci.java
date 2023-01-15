import java.sql.SQLOutput;
import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of terms you want in the fibonacci series: ");
        int p = 1;
        int i = 1;
        int n = in.nextInt();
        int count = 2;
        while (count<=n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
            System.out.println(i);
        }

    }
}
