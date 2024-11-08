import java.util.Scanner;

public class loops14 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enyer any number");
        int n = v.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
