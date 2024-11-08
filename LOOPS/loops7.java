import java.util.Scanner;

public class loops7 {
    public static void main(String[] args) {
        Scanner ng = new Scanner(System.in);
        System.out.println("enter  any  number");
        int n = ng.nextInt();
        int s = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int flag = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.print(" " + i);
            }
        }
    }
}
