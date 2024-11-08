import java.util.Scanner;

public class arrayrc8 {
    static void array(int arr[], int x) {
        if (x < 0) {
            return;
        }
        array(arr, x - 1);
        System.out.print(arr[x] + " ");

    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = hj.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = hj.nextInt();
        }
        array(arr1, n - 1);
    }
}