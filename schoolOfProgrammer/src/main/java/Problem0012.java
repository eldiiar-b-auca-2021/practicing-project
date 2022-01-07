import java.util.Scanner;

public class Problem0012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 1;
        int x = in.nextInt();
        int y = in.nextInt();
        while (count % x != 0 || count % y != 0) {
            count++;
        }
        System.out.println(count);

    }
}
