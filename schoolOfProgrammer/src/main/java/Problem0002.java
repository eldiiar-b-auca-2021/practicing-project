import java.util.Scanner;

public class Problem0002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short n = in.nextShort();
        if (n < 0) {
            n = (short) -n;
        }
        short sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
