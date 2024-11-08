import java.util.Scanner;
// good approach
public class prct2 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.print("enter any n ");
        int j = hj.nextInt();
        int ar[] = new int[j];
        for (int i = 0; i < j; i++)
            ar[i] = hj.nextInt();
        System.out.println("enter : ");
        int l = hj.nextInt();
        int g = 0;
        int m = 0;
        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                int h = ar[i] + ar[k];
                if (h == l) {
                    g = i;
                    m = k;
                    break;
                }
            }
        }
        System.out.print(g + " " + m);
    }
}
