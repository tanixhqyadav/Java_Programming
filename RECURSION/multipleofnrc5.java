import java.util.Scanner;

public class multipleofnrc5 {
    static void multiple(int n, int m) {
        if (m == 1) {
            System.out.println(n * 1);
            return;
        }
        multiple(n, m - 1);
        System.out.println(n * m);
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter any number  : ");
        int n = jk.nextInt();
        System.out.println("enter any how many multiple :: ");
        int m = jk.nextInt();
        multiple(n, m);
    }

}
