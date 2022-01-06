import java.util.Scanner;

public class Problem0003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int finalRes;
        int res = num / 10;
        if (res == 0) {
            res += 25;
            System.out.println(res);
        } else {
            finalRes = (res * (res + 1));
            System.out.println(finalRes+""+25);
        }
    }
}
