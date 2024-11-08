import java.util.Scanner;

public class arrayrc10 {
    static int sum(int arr[], int x) {
        if (x < 0) {
            return 0;
        }
        int g = 0;
        int f = sum(arr, x - 1);
        g += arr[x] + f;
        return g;
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int h = hj.nextInt();
        int arr[] = new int[h];
        for (int i = 0; i < h; i++) {
            arr[i] = hj.nextInt();
        }
        System.out.println("sum of array using rec:   " + sum(arr, h - 1));
    }
}
