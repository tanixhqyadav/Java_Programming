import java.util.Scanner;

public class loops18 {
    static int min(int n, int x) {
        if (n > x)
            return x;
        else
            return n;
    }

    static int hcf(int n, int x) {
        int k = min(n, x);
        int i = k - 1;
        while (i >= 1) {
            if ((n % i == 0) && (x % i == 0))
                return i;
            i--;
        }
        return 1;
    }

    // another approach
    static int longdiv(int x, int y) {
        int rem = 0;
        while (x % y != 0) {
            rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter two numbers:: ");
        int a = jk.nextInt();
        int b = jk.nextInt();
        System.out.println("hcf:: " + hcf(a, b) );
        System.out.println("long division " + longdiv(a, b));

    }
}
