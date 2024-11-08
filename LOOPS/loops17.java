import java.util.Scanner;

public class loops17 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the term ::: ");
        int h = n.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < h; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }

    }
}
