import java.util.Scanner;

public class optimizedbubble2 {
    static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int f = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    f = 1;
                }
            }
            if (f == 0)
                break;
        }
    }

    static void prinarr(int art[]) {
        for (int i = 0; i < art.length; i++) {
            System.out.print(art[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = hj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = hj.nextInt();
        }
        bubble(arr);
        prinarr(arr);

    }
}