import java.util.Scanner;

public class Problem0007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] set = new long[3];
        for (int i = 0; i < set.length; i++) {
            set[i] = in.nextLong();
        }
        long max = set[0];
        for (int i = 1; i < set.length; i++) {
            if (set[i] > max) {
                max = set[i];
            }
        }
        System.out.println(max);
    }
}
