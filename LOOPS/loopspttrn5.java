import java.util.Scanner;

public class loopspttrn5 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = v.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
