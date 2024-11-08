import java.util.Scanner;

public class loopspttrn9 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        int n = hj.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k =  n; k > 0; k--) {
                System.out.print(" ");
            }
            for (int h = 0; h <=i; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
