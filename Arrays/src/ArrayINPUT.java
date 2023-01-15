import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayINPUT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 123;
        arr[2] = 2312;
        arr[3] = 123;
        arr[4] = 123123;
        System.out.println(arr[3]);
        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        // for each loop:
        /*for (datatype refenerce variable  :arr
             ) {
            System.out.println(reference);

         */
        for (int num : arr) {
            System.out.println(num + " ");

        }
        // to string method
        System.out.println(Arrays.toString(arr));

    }
}
