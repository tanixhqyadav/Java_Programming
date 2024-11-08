import java.util.Scanner;
// spiral matrix array printing >>>> :  
public class array2d8spirsl2 {
    static void whilepr(int arr[][]) {
        int i = 0;
        int r = arr.length;
        int c = arr[0].length;
        while (i < r) {
            int j = 0;
            while (j < c) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static int[][] spiral(int arr[][], int r, int c) {
        int toprow = 0, botmrow = r - 1, rightcol = c - 1, leftcol = 0;
        int h = 1;
        int aart[][] = new int[arr.length][];
        while ( h < r * c) {
            // toprow>left col to rightcol
            
                for (int j = toprow; j <= rightcol; j++) {
                    aart[toprow][j] = h++;
                }
            toprow++;
            // rightcol> top row to bottom column
            for (int i = toprow; i <= botmrow; i++) {
                aart[i][botmrow] = h++;
            }
            rightcol--;
            // bottomrow>right col to leftcol
            for (int i = rightcol; i >= leftcol; i--) {
                aart[botmrow][i] = h++;
            }
            botmrow--;
            // leftcol>left bottom row to right bottom row
            for (int j = botmrow; j >= toprow; j--) {
                aart[j][leftcol] = h++;
            }
            leftcol++;
        }
        return aart;
    }

    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        System.out.println("enetr the r of 2d array");
        int r = mn.nextInt();
        System.out.println("enetr the c of 2d array");
        int c = mn.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {// ROW
            for (int j = 0; j < c; j++) {// COLUMN
                arr[i][j] = mn.nextInt();
            }
        }
        int ans[][]=spiral(arr, r, c);
        whilepr(ans);
    }
}
