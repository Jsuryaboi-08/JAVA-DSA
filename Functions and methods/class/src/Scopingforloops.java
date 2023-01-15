public class Scopingforloops {
    public static void main(String[] args) {
        int a = 10;
        /*
        anything initialised outside the block can be used anywhere
        like we can use the 'a' inside the loop but if a variable like '
        'num' it cant be used everywhere as it is initialised inside the loop
        so num can basically be printed or changed value or anything to num variable
        can be done only inside the loop. but the variable a can be used and modified anywhere and throught the code.



         */
        for (int i = 0; i <4 ; i++) {
            System.out.println(i);
            int num = 90;
            System.out.println(a);
            a= 1000;
        }
        System.out.println(a);
    }
}
