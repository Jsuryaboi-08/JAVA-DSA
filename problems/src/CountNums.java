public class CountNums {
    public static void main(String[] args) {
        int n = 23455555;

        int count = 0;
        while (n>0) {
            int rem1 = n % 10;
            if (rem1==5) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
