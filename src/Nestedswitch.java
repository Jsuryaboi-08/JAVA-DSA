import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        ;//alt + enter can be used to enhance the statemecnt if it is possible and is recommended y the intellij
        switch (empID) {
            case 1:
                System.out.println("jeyasurya");
                break;
            case 2:
                System.out.println("varshini");
                break;
            case 3:
                System.out.println("emp id number three");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("really nigga");
                }

                break;
            default:
                System.out.println("really nigga");
        }

    }
}

