import java.util.Scanner;

public class prct3 {
    static int min(int a[]) {
        int n = a.length;
        int k[] = new int[n];
        int u = a[0];
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < u) {
                u = a[i];
            }
        }
        return u;
    }

    static int[] klo(int a[]) {
        int n = a.length;
        int ar[] = new int[n];
        int o = 0;
        for (int i = 0; i < n; i++) {
            ar[o++] = min(a);
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enetr any array:");
        int o = n.nextInt();
        int arr[] = new int[o];
        for (int i = 0; i < o; i++)
            arr[i] = n.nextInt();
        System.out.println();
        int j[] = klo(arr);
        for (int i = 0; i < j.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
