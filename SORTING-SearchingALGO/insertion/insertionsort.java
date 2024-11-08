import java.util.Scanner;

public class insertionsort {
    static int[] insertion(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j < n - 1 && a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        int arr[] = { 9, 2, 7, 3, 6 };
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
