import java.util.Scanner;

public class productrc4 {
    static int pro(int n, int m) {
        if (m == 1) {
            return n;
        }
        int l = n + pro(n, m - 1);
        return l;
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter any two number: ");
        int n = hj.nextInt();
        int m = hj.nextInt();
        System.out.println(pro(n, m));
    }
}
