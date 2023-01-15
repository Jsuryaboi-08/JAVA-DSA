public class Blockscope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       // System.out.println(c); it wont work here bu=ecuz c is not initialised yet!!
        {
            a = 78;
            int c = 99;
            // values initialised in this block will remain onl in this block
            System.out.println(c);
            // these both will work as these variables are declared already outside the block
            System.out.println(a);// reassigned the original ref variable to some other value
            System.out.println(b);

        }
        System.out.println(a);
        // values can be changed
        //System.out.println(c); it wont work here because this statement call for a variable inside the block but print statement is outside.

    }
}
