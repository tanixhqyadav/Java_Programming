import java.util.Scanner;

public class loopspttrn2 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enyer any number");
        int n = v.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

}
