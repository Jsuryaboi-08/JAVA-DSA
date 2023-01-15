import java.util.Scanner;

public class Areaofiscocelestriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base of the Isosceles triangle: ");
        float basehgt = in.nextFloat();
        System.out.println("enter the height of the Isosceles triangle: ");
        float height = in.nextFloat();
        double area = (basehgt*height)/2;
        System.out.println("the total area of the isosceles triangle is : " + area);

    }

}
