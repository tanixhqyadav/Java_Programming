import java.util.Scanner;

// approach is correct but need optimised solution >>> code is not giving right answer 
public class array26 {
    static int lr(int arr[], int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println(" enter the size of array");
        int n = t.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elememts of array");
        for (int i = 1; i <= arr.length - 1; i++)
            arr[i] = t.nextInt();
        System.out.print("enter the L and R of array");
        int x = t.nextInt();
        int y = t.nextInt();
        int s = lr(arr, x, y);
        System.out.print("sum  " + s);
    }
}
