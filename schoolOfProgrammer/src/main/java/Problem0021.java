import java.util.Scanner;

public class Problem0021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a > b && a > c ) {
            if (b > c) {
                res = a - c;
            } else {
                res = a - b;
            }
        } else if (b > a && b > c) {
            if (a > c) {
                res = b - c;
            } else {
                res = b - a;
            }
        } else if (c > a && c > b) {
            if (a > b) {
                res = c - b;
            } else {
                res = c - a;
            }
        }

        if (res < 0) {
            res = -res;
        }
        System.out.println(res);
    }
}
