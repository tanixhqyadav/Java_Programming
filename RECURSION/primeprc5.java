import java.util.Scanner;
// wrong need to check again
public class primeprc5 {
    static int prime(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int c = 0;
        if (n % prime(n - 1) != 0) {
            c++;
        }
        if (c == 0)
            return n;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter any number : ");
        int k = jk.nextInt();
        if (prime(k) == k)
            System.out.println("prime");
        else
            System.out.println("NOt ");

    }
}
