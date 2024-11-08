import java.util.Scanner;

public class loops20 {
    static void prime(int n) {
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 1)
            System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter any number");
        int h = t.nextInt();
        int l = 0;
        for (int i = 0; i < h; i++) {

            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                prime(l);
                l++;
            }
            System.out.println();
        }
    }
}
