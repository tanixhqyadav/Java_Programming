import java.util.Scanner;

public class array2d7spiral {
    static void printarray(int arr[][]) {
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

    static void spiral(int arr[][], int r, int c) {
        int toprow = 0, botmrow = r - 1, rightcol = c - 1, leftcol = 0;
        int totalelements = 0;
        while (totalelements < r * c) {
            // toprow>left col to rightcol
            for (int j = toprow; j <= rightcol; j++) {
                System.out.print(arr[toprow][j] + " ");
                totalelements++;
            }
            toprow++;
            // rightcol> top row to bottom column
            for (int i = toprow; i <= botmrow; i++) {
                System.out.print(arr[i][botmrow] + " ");
                totalelements++;
            }
            rightcol--;
            // bottomrow>right col to leftcol
            for (int i = rightcol; i >= leftcol; i--) {
                System.out.print(arr[botmrow][i] + " ");
                totalelements++;
            }
            botmrow--;
            // leftcol>left bottom row to right bottom row
            for (int j = botmrow; j >= toprow; j--) {
                System.out.print(arr[j][leftcol] + " ");
                totalelements++;
            }
            leftcol++;
        }
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter r :  ");
        int r = jk.nextInt();
        System.out.println("enter c :  ");
        int c = jk.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = jk.nextInt();
            }
        }
        System.out.println("original array:  : :");
        printarray(arr);
        System.out.println();
        System.out.println("spiral array::  > ");
        spiral(arr, r, c);
    }
}
