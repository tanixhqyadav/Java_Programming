import java.util.Scanner;

public class array21 {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void prrray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0)
            left++;
            if (arr[right] == 1)
                right++;
        }
        prrray(arr);
    }


    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int k = hj.nextInt();
        int arr[] = new int[k];
        for (int i = 0; i < k; k++) {
            arr[i] = hj.nextInt();
        }
        prrray(arr);
        sort(arr);
    }
}
