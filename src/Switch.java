import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        String a = "Surya";
//        String b = "Surya";
//
//        System.out.println(a == b);
//        String fruit = in.next();
//        switch (fruit){
//            case("Mango"):
//                System.out.println("King of fruits");
//                break;
//            case("Apple"):
//                System.out.println("A sweet red fruit");
//                break;
//            case("Banana"):
//                System.out.println("You sussy baka");
//                break;
//
//            default:
//                System.out.println("Enter a valid fruit");


        
        // enhanced switch hover over switch and use alt + enter
        String fruit = in.next();
        switch (fruit) {
            case ("Mango") -> System.out.println("King of fruits");
            case ("Apple") -> System.out.println("A sweet red fruit");
            case ("Banana") -> System.out.println("You sussy baka");
            default -> System.out.println("Enter a valid fruit");
        }
    }

}
