import java.util.Scanner;

public class prct1 {
    static void zero(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 0) {
                    int remp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = remp;
                }
            }
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = hj.nextInt();
        int arrt[] = new int[n];
        for (int i = 0; i < n; i++)
            arrt[i] = hj.nextInt();
        zero(arrt);
        print(arrt);
    }
}