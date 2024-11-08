import java.util.Scanner;
//fibonaci series
public class loopspttrn6 {
        public static void main(String[] args) {
                Scanner v = new Scanner(System.in);
                System.out.println("Enter any number");
                int n = v.nextInt();
                int a, b, c;
                a = 0;
                b = 0;
                c = 1;
                for (int i = 1; i <= n; i++) {
                        System.out.print(" " + c);
                        a = b;
                        b = c;
                        c = a + b;
                }
        }
}
