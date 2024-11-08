import java.util.Scanner;

public class array2d5 {
    static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int arr[][]){
        int ans[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[i][j]=arr[j][i];// without new array we can just  swap these elements 
            }
        }
        return ans;
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
        System.out.println("original array : ");
        printarray(arr);
        System.out.println("rotated arary :   ");
        int h[][]=transpose(arr);
        for (int i = 0; i < r; i++) {// ROW
            for (int j = h.length-1; j >=0; j--) {// COLUMN
                System.out.print(h[i][j]+" ");
            }
            System.out.println();
        }
    }
}
