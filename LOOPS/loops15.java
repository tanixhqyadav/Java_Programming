import java.lang.Math;
import java.util.Scanner;

public class loops15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = x.nextInt();
        int d, c = 1, s = 0, m;
        while (n >= 0) {
            d = n % 10;
            s += (d * c);
            n /= 10;
            c *= 2;
        }
        System.out.println(s);
    }
}
