import java.util.Scanner;

public class Battingaverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name of the batsman: ");
        String name = in.next();
        System.out.println("enter the total runs scored by the batsman: ");
        int score = in.nextInt();
        System.out.println("enter the total number of times " + name + " has been out: ");
        int out = in.nextInt();
        float average = score / out;
        if (average > 49.99) {
            System.out.println(" the batsman haas a great ability to hit runs. the batting average is: ");
            System.out.println(average);
        } else if (average < 49.99) {
            System.out.println(" the batsman has'nt shown his ability to hit fully as of now. the batting average is:");
            System.out.println(average);
        }
    }
}
