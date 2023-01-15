import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(1,2,69,420);
        multiple(2,3,"surya","varshini");
    }
    /*
    always the ...v shouold be used as the last argument.
    and the order of the arguments are important.
    we cant skip the order of the decalred variables.
    if it is string after char we have to follow that or else eorror would occur.
     */
    static void multiple(int a , int b , String...c){
        System.out.println(a);
        System.out.println(b+ Arrays.toString(c));

    }

    private static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
