import java.util.Scanner;

public class Discountpercetage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the initial price of the product: ");
        float inip = in.nextFloat();
        System.out.println("enter the final price of the product: ");
        float finp = in.nextFloat();
        if (inip > finp) {
            float disc = ((inip - finp)/inip) * 100;
            System.out.println("the percentage of discount is :" + disc);
        }else{
            System.out.println("the inputs are invalid for this program");
        }
    }
}