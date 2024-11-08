import java.util.*;
public class largestsubarray {
    static Scanner jk=new Scanner(System.in);
    static void subarray(){
        int n=jk.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=jk.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=ar[j];
                ans=Math.max(sum,ans);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        subarray();
    }
}
