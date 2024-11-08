import java.util.Scanner;

public class prct1 {
    static void insertion(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    static void prinarr(int b[]) {
        int n = b.length;
        for (int i = n/2; i <n; i++)
            System.out.print(b[i] + " ");
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter the size  : ");
        int n = hj.nextInt();
        int arra[] = new int[n];
        for (int i = 0; i < n; i++) {
            arra[i] = hj.nextInt();
        }
        insertion(arra);
        for (int i = 0; i < n; i++)
            System.out.print(arra[i] + " ");
        System.out.println();
        prinarr(arra);

    }
}
