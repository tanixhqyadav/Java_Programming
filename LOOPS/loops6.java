import java.util.Scanner;

public class loops6 {
    public static void main(String[] args) {
        Scanner fgh = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = fgh.nextInt();
        int d;
        for (int i = 0; i <= 9; i++) {
            int t = 0;
            int s = n;
            while (s != 0) {
                d = s % 10;
                if (d == i)
                    t++;
                s = s / 10;
            }
            System.out.println(i + "frequecy is " + t);
        }
    }
}
