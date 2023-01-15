import java.util.Scanner;

public class Armstrongnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        for (int i = 100; i<1000;i++){
            if (Amstrong(i)){
                System.out.println(i +" ");

            }
        }

    }

    static boolean Amstrong(int a) {
        int original = a;
        int sum = 0;
        while(a>0){
            int rem = a%10;
            sum = sum+(rem*rem*rem);
            a=a/10;

        }
        if (sum==original){
            return true;

        }return false;
    }
}
