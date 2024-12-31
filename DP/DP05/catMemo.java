import java.util.*;
public class catMemo {
    public static void main(String[] args) {
        int x=4;
        int dp[]=new int[x+1];
        System.out.println(catmem(x, dp));
    }
    public static int cat(int x){
        if(x==1 || x==0){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=x-1;i++){
            ans+=cat(i)*cat(x-i-1);
        }
        return ans;
    }
    public static int catmem(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catmem(i,dp)*catmem(n-i-1, dp);
        }
        return dp[n]=ans;
    }
}

