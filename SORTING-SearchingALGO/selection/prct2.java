import java.util.Scanner;

public class prct2 {
    static void slect(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[index])
                    index = j;
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }

    static int small(int ar[], int k) {
        slect(ar);
        
        return ar[k-1];
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enetr the size of array ");
        int n = hj.nextInt();
        int arrt[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrt[i] = hj.nextInt();
        }
        System.out.println("enter the element : ");
        int k = hj.nextInt();
        System.out.println("smalllest element " + small(arrt, k));

    }

}
