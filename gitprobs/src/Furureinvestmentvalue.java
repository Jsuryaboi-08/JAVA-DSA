import java.util.Scanner;

public class Furureinvestmentvalue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount : ");
        double amt = in.nextDouble();
        System.out.println("enter the rate of appreciation in percentage: ");
        double rate = in.nextDouble();
        System.out.println("enter the number of estimated years of holding: ");
        int years = in.nextInt();
        int a = years;
        while (a!=0){
            amt = amt+(amt*(rate/100));
            a--;
        }
        System.out.println("the expected amount of investment in " + years +" is :" + amt);

    }
}
