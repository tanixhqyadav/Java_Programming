import java.util.Scanner;
public class array2d4{
    static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int arr[][]){
        int ans[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[i][j]=arr[j][i];// without new array we can just  swap these elements 
            }
        }
        printarray(arr);
    }
    public static void main(String[] args) {
        Scanner nk=new Scanner(System.in);
        System.out.println("enter size ::: ");
        int n=nk.nextInt();
        int arrt[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arrt[i][j]=nk.nextInt();
            }
        }
        printarray(arrt);
        System.out.println();
        System.out.println(" transpose matrix is : ");
        transpose(arrt);
    }
    
}