import java.util.Scanner;
public class quick {
    static void  display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int ar[],int x,int y){
        int temp=ar[x];
        ar[x]=ar[y];
        ar[y]=temp;
    }
    static void quickSort(int arr[], int st,int end){
        if (st>=end) return;
        int pi=partition(arr,st , end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    static int partition(int ar[], int st, int end){
        int pivot= ar[st];
        int cnt=0;
        for(int i=st+1;i<=end;i++){
            if(ar[i]<=pivot){
                cnt++;
            }
        }
        int pivotidx=st+cnt;
        swap(ar, st, pivotidx);
        // elementska arrangement hojayga sare pivo lef  trf chote honge or right trg bade honge 
        int i=st, j=end;
        while(i<pivotidx && j>pivotidx){
            while(ar[i]<=pivot){
                i++;
            }
            while(ar[j]>pivot){
                j--;
            }
            if(i<pivotidx && j>pivotidx){
                swap(ar, i, j);
                i++;
                j--;
            }
        }

        return pivotidx;
    }
    
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int ar[]={7,13,8,5,10,2,4};
        int n=a r.length;
        System.out.println("before swapping");
        display(ar);
        System.out.println();
        quickSort(ar,0,n-1);
        System.out.println("after swapping");
        display(ar);
    }
}
