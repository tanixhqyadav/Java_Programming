
import java.util.*;

public class LIS{
    public static void main(String[] args) {
        // !DOING LIS HAS THREE PATTERN USING NESTED LOOP || LOOP+Binary Search || LCS method
        // * A new way of doing LIS IS {LONGEST COMMON SORTED SUBSEQUENCE}
        // ! how to do this
        // ! take a hashset for uniques element for duplicacy case
        // ! store in new array and Sort it 
        // ! NOW APPLY LCS ON BOTH THE ARRAY 
        int xr[]={0,1,0,3,2,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i:xr){
            set.add(i);
        }
        int hr[]=new int[set.size()];
        int l=0;
        for(int kl:set){
            hr[l++]=kl;
        }
        int dp[][]=new int[hr.length+1][xr.length+1];
        for(int y[]:dp){
            Arrays.fill(y,-1);
        }
        System.out.println(LCS(xr, hr, hr.length, xr.length, dp));
    }
    public static int LCS(int ar[], int vr[],int i, int j,int dp[][]){
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(ar[j-1]==vr[i-1]){
            return dp[i][j]=1+LCS(ar,vr,i-1,j-1,dp);
        }
        else{
            return dp[i][j]=Math.max(LCS(ar, vr, i-1, j, dp),LCS(ar, vr, i, j-1, dp));
        }
    }
}