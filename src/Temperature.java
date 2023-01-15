import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" please enter the temperature in C:");
        float temp_c=in.nextFloat();
        float temp_f= (temp_c * 9/5)+32;
        System.out.println("Temperature in farenhiet is: " + temp_f);
    }
}
