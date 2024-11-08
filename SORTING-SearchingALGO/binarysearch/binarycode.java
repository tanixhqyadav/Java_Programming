import java.util.*;
public class binarycode {
    public static void main(String[] args) {
        Scanner hj=new Scanner(System.in);
        System.out.println("enter the size and element of array");
        int n=hj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=hj.nextInt();
        System.out.println("enter the element you want to search ");
        int k=hj.nextInt();
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid =(st+end)/2;
            if(arr[mid]==k){
                System.out.println("Yes its index is : "+mid+"  SEARCH SUCCESSFUL");
                break;
            }
            else if(k<arr[mid]){
                end=mid-1;
            }
            else if(k>arr[mid]){
                st=mid+1;
            }
        }
    }
}