import java.util.Scanner;

public class Curvedareacyclinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius of the cylinder: " );
        float a = in.nextFloat();
        System.out.println("enter the height of the cylinder: ");
        float b = in.nextFloat();
        double c = 0;
        c = 2* 3.14* b*a;
        System.out.println("the curved surface area of the cylinder of the given parameters is:" + c);

    }
}
