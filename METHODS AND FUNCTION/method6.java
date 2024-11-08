import java.util.Scanner;

class palindrome {
    int paln(int x) {
        int s = 0;
        int c = x;
        while (c != 0) {
            s = s * 10 + c % 10;
            c /= 10;
        }
        if (s == x)
            return x;
        else
            return 0;
    }
}

public class method6 {
    public static void main(String[] args) {
        Scanner jf = new Scanner(System.in);
        palindrome obj = new palindrome();
        System.out.println("enter any number");
        int n = jf.nextInt();
        if (obj.paln(n) == n)
            System.out.println("palindrome number");
        else
            System.out.println("NO");
    }
}
