import java.util.Scanner;

public class Methodscirclearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        int a = in.nextInt();
        double b=areacicle(a);
        System.out.println("the area of the circle is : " + b);
    }

    static double areacicle(double a) {
        double b = 0;
        b=2*3.14*(a*a);
        return b;

    }
}
