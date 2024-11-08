import java.util.Scanner;

public class prct4 {
    static int[] freq(int arr[], int n) {
        int frequ[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            frequ[arr[i]]++;
        }
        return frequ;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        int n = jk.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jk.nextInt();
        }
        int trq[] = freq(arr, n);
        for (int i = 0; i < trq.length; i++) {
            if (trq[i] == 0) {
                System.out.println(trq[i]);
                break;
            }
        }

    }
}
