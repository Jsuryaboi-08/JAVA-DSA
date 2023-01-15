import java.beans.PropertyEditorManager;
import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        int num = in.nextInt();

        while (num>0){
            int rem = num%10;
            num = num/10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);



    }
}
