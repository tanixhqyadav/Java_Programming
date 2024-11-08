import java.util.*;

public class binarysearchfunction {
    static boolean binary(int arr[], int ele) {
        int l = arr.length;
        int st = 0, end = l - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == ele) {
                return true;
            } else if (ele < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = jk.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = jk.nextInt();
        System.out.println("enter the target element : ");
        int t = jk.nextInt();
        System.out.println(binary(arr, t));

    }
}