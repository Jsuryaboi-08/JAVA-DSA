import java.util.Scanner;

public class Averageofnnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of number you are going to enter");
        int n = in.nextInt();
        int count = 1;
        int c=0;
        while (count<=n){
            System.out.println("enter the"+ count+"number");
            int a = in.nextInt();
            c += a;
            count++;
        }
        float d=0;
        d=c/n;
        System.out.println(d);



    }


}

