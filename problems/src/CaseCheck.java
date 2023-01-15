import javax.swing.*;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //.trim() removes extra space
        //|| is or operator
        //!= is not euqal to operator
        // && is and operator
        char ch = in.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println(" The given charecter is of lower case");
        }else {
            System.out.println("The given charecter is upper case");
        }

    }
}
