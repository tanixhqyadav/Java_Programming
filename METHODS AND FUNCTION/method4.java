import java.util.Scanner;

class armstrong {
    public int armno(int n) {
        int d = n;
        int s = 0, c = 0, p;
        while (d != 0) {
            d /= 10;
            c++;
        }
        int f = n;
        while (f > 0) {
            p = f % 10;
            s += Math.pow(p, c);
            f /= 10;
        }
        if (s == n)
            return n;
        else
            return 0;
        
    }
}

public class method4 {
    public static void main(String[] args) {
        Scanner fg = new Scanner(System.in);
        armstrong j = new armstrong();
        System.out.println("enter any number:--");
        int k = fg.nextInt();
        if (k == j.armno(k))
            System.out.println("Armstrong number");
        else
            System.out.println("No");
    }
}
