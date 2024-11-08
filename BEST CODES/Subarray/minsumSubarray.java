import java.util.*;
// question if array is [3,1,2,4] and make all subarray and find minimum bin them [3],[1],[2],[4],min([3,1]),min[[3,1,2]],min[[3,1,2,4]],min[[1,2]]
// min[[1,2,4]],min[2,4] == 17 
public class minsumSubarray{
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int arr[]={3,1,2,4};
        System.out.println(Subarray(arr));
        int n=jk.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=jk.nextInt();
        }
        System.out.println(Subarray(ar));
    }
    public static long Subarray(int ar[]){
        long k=0;
        long o=0;
        int n=ar.length;
        for(int i=0;i<n;i++){
            int min=ar[i];
            for(int j=i+1;j<n;j++){
                min=Math.min(ar[j],min);
                k+=min;
            }
        }
        for(int s=0;s<n;s++){
            o+=ar[s];
        }
        return k+o;
    }
}