import java.util.Scanner;

public class array2D1 {
    static void  whilepr(int arr[][]){
        int i=0;
        int r=arr.length;
        int c=arr[0].length;
        while(i<r){
            int j=0;
            while(j<c){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
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
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        whilepr(arr);
    }
}
