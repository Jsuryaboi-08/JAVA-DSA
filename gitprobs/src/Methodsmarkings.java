import java.util.Scanner;

public class Methodsmarkings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the marks scored out of 100");
        int a = in.nextInt();
        if(a<0||a>100){
            System.out.println("enter a valid mark");
        }else {
            marks(a);
        }


    }
    private static void marks(int a) {
        if(100>=a&&a>=91){
            System.out.println("A grade");
        } else if (90>=a&&a>=81) {
            System.out.println("B grade");
        } else if (80>=a&&a>=71) {
            System.out.println("C grade");
        } else if (70>=a&&a>=61) {
            System.out.println("D grade");
        }else if(60>=a&&a>41){
            System.out.println("E grade");
        } else if (a<=40) {
            System.out.println("fail");
        }
    }
}
