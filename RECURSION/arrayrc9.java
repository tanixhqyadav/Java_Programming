import java.util.Scanner;
public class arrayrc9 {
    static int maxarr(int arr[], int x) {
        if (x < 0) {
            return Integer.MIN_VALUE;
        }

        int h = maxarr(arr, x - 1);
        int d = arr[x];
        if (d < h) {
            d = h;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = hj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = hj.nextInt();
        }
        System.out.println("The maximum element in the array is: " + maxarr(arr, n - 1));
    }
}
