import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = in.nextInt();
        int d = 0;
        int c = 1;
        int b = 0;
        while(a>0){
            int rem = a%10;
            b += rem;
            c *= rem;
            a=a/10;
        }d=c-b;
        System.out.println(d);
    }
}
//    import java.util.Scanner;
//
//public class Reverse1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int ans = 0;
//        int num = in.nextInt();
//
//        while (num>0){
//            int rem = num%10;
//            num = num/10;
//
//            ans = ans * 10 + rem;
//        }
//        System.out.println(ans);
//
//
//
//    }
//}
