import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner ty = new Scanner(System.in);
        System.out.println("enter any intger");
        int n = ty.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print(" " + i);
        }
    }
}
