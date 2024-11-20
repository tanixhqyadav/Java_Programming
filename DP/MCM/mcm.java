import java.util.*;
public class mcm {
    public static void main(String[] args) {
        int ar[]={4,2,3,5,1};
        System.out.println(memo(ar, 0, ar.length-1));
    }
    public static int memo(int ar[], int si, int ei){
        if(si+1==ei){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=si+1;k<ei;k++){
            int fs=memo(ar, si, k);
            int ss=memo(ar, k, ei);
            int self=ar[si]*ar[k]*ar[ei];
            ans=Math.min(ans,fs+ss+self);
        }
        return ans;
    }
}
