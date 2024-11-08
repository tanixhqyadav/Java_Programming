import java.util.Scanner;

// MULTIPLICATION OF 2 ARRAYS
public class array2d3 {
    static void inputprr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplication(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2) {
            System.out.println("multipliaction can not be done");
            return;
        }
        int ans[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int l = 0; l < c1; l++) {
                    ans[i][j] += (a[i][l] * b[l][j]);
                }
            }
        }
        inputprr(ans);
    }

    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        System.out.println("enetr the r of 2d array");
        int r = mn.nextInt();
        System.out.println("enetr the c of 2d array");
        int c = mn.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mn.nextInt();
            }
        }
        int arra[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arra[i][j] = mn.nextInt();
            }
        }
        multiplication(arr, r, c, arra, r, c);

    }
}
