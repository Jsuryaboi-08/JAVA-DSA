public class Methodscope {
    public static void main(String[] args) {

    }
    static void swap(int num1 , int num2){
        int temp = num1;
        num1=num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }
}
