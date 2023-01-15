import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrayinpout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][];
        for (int row = 0; row < arr.length; row++) {
            // for each cal in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

       // System.out.println(Arrays.toString(arr));
        // output
        for (int row = 0; row < arr.length; row++) {
            // for each cal in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(row[]col[]);
            }
            System.out.println();

        }
    }
}
