import java.util.*;

public class fibio{
    public static void main(String[] args) {
        int xx=5;
        int dp[]=new int[xx+1];
        Arrays.fill(dp, -1);
        System.out.println(fibDp(dp, xx));
        System.out.println(recfib(xx));
        System.out.println(Tabu(xx));
    }
    //! Memoization is Top Down Approach
    //! Tabulation is Bottom Up Approach
    public static int fibDp(int dp[],int n){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int s=fibDp(dp,n-1);
        int y=fibDp(dp, n-2);
        return dp[n]=s+y;
    }
    public static int recfib(int n){
        if(n==0 || n==1){
            return n;
        }
        return recfib(n-1)+recfib(n-2);
    }
    public static int Tabu(int n){
        int xr[]=new int[n+1];
        xr[0]=0;
        xr[1]=1;
        for(int i=2;i<xr.length;i++){
            xr[i]=xr[i-1]+xr[i-2];
        }
        return xr[n];
    }
}