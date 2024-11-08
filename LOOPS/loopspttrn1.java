import java.util.Scanner;

public class loopspttrn1 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enyer any number");
        int n = v.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
