import java.util.Scanner;

public class sumofnumrc4 {
    static int sumno(int x) {
        if (x >= 0 && x <= 9) {
            return x;
        }
        return sumno(x / 10) + x % 10;
    }

    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        int j = kl.nextInt(); 
        System.out.println(sumno(j));

    }
}