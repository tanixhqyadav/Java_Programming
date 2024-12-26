import java.util.*;
public class knapsack{
    public static void main(String[] args) {
        int cp=4;
        int wt[]={1,2,3,2,2};
        int cap[]={8,4,0,5,3};
        int dp[][]=new int[wt.length][cp+1];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        System.err.println(knapsackfndp(wt, cap, cp, 0, dp));
        System.err.println(tabu(wt, cap, cp));
    }
    public static int knapsackfn(int wt[], int cval[], int cap, int i){
        if(i==wt.length || cap==0){
            return 0;
        }
        int inc=0,exc=0;
        if(cap>=wt[i]){
            inc=cval[i]+knapsackfn(wt, cval, cap-wt[i], i+1);
        }
        exc=knapsackfn(wt, cval, cap, i);
        return Math.max(exc,inc);
    }
    public static int knapsackfndp(int wt[], int cval[], int cap, int i,int dp[][]){
        if(i==wt.length || cap==0){
            return 0;
        }
        if(dp[i][cap]!=-1){
            return dp[i][cap];
        }
        int inc=0,exc=0;
        if(cap>=wt[i]){
            inc=cval[i]+knapsackfndp(wt, cval, cap-wt[i], i+1,dp);
        }
        exc=knapsackfndp(wt, cval, cap, i+1,dp);
        return dp[i][cap]=Math.max(exc,inc);
    }
    public static int tabu(int wt[], int cap[], int cp){
        int xp[][]=new int[wt.length+1][cp+1];
        for(int i=0;i<=cp;i++){
            xp[0][i]=0;
        }
        for(int i=0;i<xp.length;i++){
            xp[i][0]=0;
        }
        for(int i=1;i<xp.length;i++){
            for(int j=1;j<=cp;j++){
                int w=wt[i-1];
                int val=cap[i-1];
                if(w<=j){
                    xp[i][j]=Math.max(val+xp[i-1][j-w],xp[i-1][j]);
                }
                else{
                xp[i][j]=xp[i-1][j];
                }
            }
        }
        return xp[xp.length-1][cp];
    }
}