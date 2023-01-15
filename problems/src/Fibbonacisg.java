import java.util.Scanner;

public class Fibbonacisg {
    public static void main(String[] args) {

        /*

        find the nth fibbonacci number.
        here i have to create a temporary variabl;e called teemp and store the wanted info on that variable.

         */
        Scanner in = new Scanner(System.in);
        int p = 0;
        int i = 1;
        int n = in.nextInt();
        int count = 2;
        while (count<=n){
            int temp = i;
            i=i+p;
            p = temp;
            count++;

        }
        System.out.println(i);

    }
}
