import java.util.Scanner;

public class Problem0009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] set = new int[n];
        for (int i = 0; i < set.length; i++) {
            set[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] > 0) {
                sum += set[i];
            }
        }
        int max = set[0];
        int maxIndex = 0;
        for (int i = 1; i < set.length; i++) {
            if (set[i] > max) {
                max = set[i];
                maxIndex = i;
            }
        }
        int min = set[0];
        int minIndex = 0;
        for (int i = 1; i < set.length; i++) {
            if (set[i] < min) {
                min = set[i];
                minIndex = i;
            }
        }
        int product = 1;
        if (maxIndex < minIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            product *= set[i];
        }
        System.out.println(sum + " " + product);
    }
}
