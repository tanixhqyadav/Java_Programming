import java.util.*;
public class merge{
    static void merge(int arr[], int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int [n2];
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=arr[l+i];
        for( j=0;j<n2;j++) right[j]=arr[mid+1+j];
        i=0;j=0;k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++]; 
        }

    }


    static void mergeSort(int arr[], int l , int r){
        //recursive function 
        if (l==r) return;
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid , r);
    }


    static void  display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int ar[]={7,20,4,11,8,2};
        System.out.println("before merge sort ");
        display(ar);
        System.out.println();
        int n=ar.length;
        mergeSort(ar, 0, n-1);
        System.out.println("after merge sort ");
        display(ar);
    }
}