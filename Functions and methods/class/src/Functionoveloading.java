import java.sql.Statement;

public class Functionoveloading {
    public static void main(String[] args) {
        fun(69);
        fun("jeya surya");
        sum(2,3);
        sum(2,3,4);



    }
    /*
    two methods can exist with the same name if the parameters are different.
    number of arguments should be different or type of arguments should be different.
     */
    static void sum( int a ,int b ){
        int c = a+b;
        System.out.println(c);
    }
    static void sum( int a , int b, int c){
        int d= a+b+c;
        System.out.println(d);
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
