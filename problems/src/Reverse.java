import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int count = 0;
        while (a>0) {
            int rem = a % 10;
            if (rem <= 9) {
                count++;
                System.out.println(rem);

            }
            a=a/10;


        }
    }
}
