import java.util.Scanner;

public class prct3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int h = n.nextInt();
        int arr[] = new int[h];
        for (int i = 0; i < h; i++) {
            arr[i] = n.nextInt();
        }
        int k = n.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                int y = arr[i] - arr[j];
                if (y == k) {
                    System.out.println("YES" + arr[i] + " " + arr[j]);
                }
            }
        }

    }
}
