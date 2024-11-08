import java.util.Scanner;
public class array20 {
    // sorting a array consist of one and zero
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n=jk.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=jk.nextInt();
        }
        int c=0;
        int d=arr.length;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0)
            c++;
        }
        System.out.print("Sorted array  >");
        for(int k=0;k<d;k++){
            if(k<c)
            arr[k]=0;
            else
            arr[k]=1;
            System.out.print(arr[k]+" ");
        }


    }
}
