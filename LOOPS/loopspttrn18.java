import java.util.Scanner;

public class loopspttrn18 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        int n = hj.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if(k%2==0)
                System.out.print("*");
                else
                System.out.print("!");
            }
            System.out.println();
        }
    }

}