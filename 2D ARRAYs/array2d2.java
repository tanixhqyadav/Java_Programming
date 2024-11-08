import java.util.Scanner;

public class array2d2{
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
        int arra[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arra[i][j] = mn.nextInt();
            }
        }
        int arry[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry[i][j]=arr[i][j]+arra[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arry[i][j]+" ");
            }
            System.out.println();
        }
    }
}