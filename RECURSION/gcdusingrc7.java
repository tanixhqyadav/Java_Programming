import java.util.Scanner;

public class gcdusingrc7 {
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        int y = k.nextInt();
        System.out.println(gcd(x, y));
    }
}
