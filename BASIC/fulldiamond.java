import java.util.Scanner;

public class fulldiamond {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter any number :  ");
        int n = hj.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * n - 1; k > 2 * i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
