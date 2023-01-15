import java.util.Scanner;

public class Methodslargestandsmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        System.out.println("enter the third number");
        int c = in.nextInt();
        int max = 0;
        max =maximum(a,b,c);
        System.out.println(max);
        int min = 0;
        min = minimum(a,b,c);
        System.out.println(min);
    }
    static int maximum(int a,int b,int c) {
        int max = 0;

        if (a > b && a > c) {

            max = a;
        } else if (b > a && b > c) {
            max = b;

        } else if (c > a && c > b) {
            max = c;

        }
        return max;
    }
    static int minimum (int a , int b,int c){
        int min =0;
        if (a<b&&a<c){
            min = a;

        } else if (b<a&&b<c) {
            min = b;
        } else if (c<b&&b<a) {
            min =a;

        }
        return min;
    }
}