public class Shadowing {
    static int x = 90;// this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);//90
        int x= 40;// the peviox x value is shadowed by this x variable.
        System.out.println(x);//40
        fun();

    }

    private static void fun() {
        System.out.println(x);
    }
}