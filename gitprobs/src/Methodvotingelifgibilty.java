import java.util.Scanner;

public class Methodvotingelifgibilty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age");
        int a = in.nextInt();
        if(a<0){
            System.out.println("enter a valid age");

        }else{
            voting(a);
        }
    }

    private static void voting(int a) {
        if (a>=18){
            System.out.println("your are able to vote");
        }else {
            System.out.println("you are not eligible for voting");
        }
    }
}
