
import java.util.Scanner;

public class nto1rc1 {
    static void printdec(int n) {
        if (n == 0) {
            return;
        }

        else {
            if (n == 1) {
                System.out.println(1);
                return;
            }
            System.out.println(n);
            printdec(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("enter any number : > ");
        int n = nm.nextInt();
        printdec(n);
    }

}
