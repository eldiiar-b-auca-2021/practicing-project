import java.util.Scanner;

public class Problem0005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] set = new int[num];
        int a = 0,b = 0;
        for (int i = 0; i < set.length; i++) {
            set[i] = in.nextInt();
        }
        for (int i = 0; i < set.length; i++) {
            if (set[i] % 2 != 0) {
                a++;
                System.out.print(set[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < set.length; i++){
            if (set[i] % 2 == 0) {
                b++;
                System.out.print(set[i]+" ");
            }
        }
        System.out.println();
        if (a > b) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
