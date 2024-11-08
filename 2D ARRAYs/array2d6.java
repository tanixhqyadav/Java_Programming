import java.util.Scanner;
public class array2d6 {
    static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int ans[][]=new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];//ith row has i+1 column
            ans[i][0]=ans[i][i]=1;//FIRST AND LAST ELEMENT OF ROW INS ZERO
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner gh=new  Scanner(System.in);
        System.out.println("enter n ::  ");
        int  n=gh.nextInt();
        int arrt[][]=pascal(n);
        printarray(arrt);
    }
}
