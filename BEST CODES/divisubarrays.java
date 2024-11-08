import java.util.*;
public class divisubarrays {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int t = scn.nextInt(); 
        while(t-->0){
           int n = scn.nextInt(); 
           int[] arr=new int[n];
           for (int i = 0; i < n; i++){
            arr[i]=scn.nextInt();
          }
            System.out.println(subarraysDivByK(arr, n)); 
        }
    }
    public static long subarraysDivByK(int[] ar, int n) {
		long sum=0;
		// very good approach
		int freq[]=new int[arr.length];
		int n=ar.length;
		freq[0]=1;
		for(int i=0;i<n;i++){
			sum=sum+ar[i];
			int idx=(int) (sum%n);
			freq[idx]=freq[idx]+1;
		}	
    }
}