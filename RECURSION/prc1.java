import java.util.Scanner;

public class prc1 {
    static void hj(int n) {
        if (n < 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        hj(n - 5);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter any number : ");
        int k = jk.nextInt();
        hj(k);
    }
}
