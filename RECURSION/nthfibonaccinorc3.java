import java.util.Scanner;

public class nthfibonaccinorc3 {
    // NTH Fibonnaci Number:>
    static int fibo(int n) {
        // BASE CASE
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        // if (n==0 || n==1)
        // return n; // same what is written above
        // RECURSIVE CALL
        int s = fibo(n - 1) + fibo(n - 2);// SELF WORLK (+)
        return s;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.print("enter th nth term : ");
        int n = jk.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
        int k = fibo(n);
        System.out.println(k);

    }
}