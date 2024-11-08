import java.util.Scanner;

public class prct2 {
    static void bubble(String arr[]) {
        int n = arr.length;
        int f = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    f = 1;
                }
            }
            if (f == 0)
                break;
        }
    }

    static void prinarr(String art[]) {
        for (int i = 0; i < art.length; i++) {
            System.out.print(art[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = hj.nextInt();
        hj.nextLine();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = hj.nextLine();
        }
        bubble(arr);
        prinarr(arr);

    }

}
