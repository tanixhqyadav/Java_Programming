import java.util.Scanner;

public class loops19 {

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        int s = 0;
        while (hj.hasNextInt())// it is checking while it has next int
        {
            int h = hj.nextInt();
            if (h >= 0) {
                s += h;
            } else {
                System.out.println(-1);
            }
        }
        System.out.print("sum" + s);
    }
}
