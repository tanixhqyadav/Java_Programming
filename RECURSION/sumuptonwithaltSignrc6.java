import java.util.Scanner;

public class sumuptonwithaltSignrc6 {
    static int altsum(int n) {
        if (n == 0)
            return 0;
        return altsum(n - 1) + n;
    }

    static int altsignssum(int n) {
        if (n == 0)
            return 0;

        if (n % 2 == 0)
            return altsignssum(n - 1) - n;
        else
            return altsignssum(n + 1) + n;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = jk.nextInt();
        System.out.println(altsum(n));
        System.out.println("series sum our: ");
        System.out.println(altsignssum(n));
    }
}
