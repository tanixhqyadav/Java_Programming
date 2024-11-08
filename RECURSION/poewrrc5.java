import java.util.Scanner;

public class poewrrc5 {
    static int pow(int p, int q) {
        if (q == 0)
            return 1;
        return p * pow(p, q - 1);
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the number : ");
        int p = jk.nextInt();
        System.out.println("enter the power");
        int q = jk.nextInt();
        System.out.println("ans " + pow(p, q));
    }
}
