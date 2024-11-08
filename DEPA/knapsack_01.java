import java.util.Arrays;

public class knapsack_01 {
    public static int  dp_knapsack(int wt[],int val[],int index,int k,int dp[][]){
        if(index==wt.length){
            return 0;
        }
        if(dp[index][k]!=-1){
            return dp[index][k];
        }
        int pick,not_pick;
        pick=not_pick=0;
        if(wt[index]<=k){
            pick=dp_knapsack(wt,val,index+1,k-wt[index],dp)+val[index];
        }
        not_pick=dp_knapsack(wt,val,index+1,k,dp);
        return 
        dp[index][k]=Math.max(pick,not_pick);
    }
    public static int knasack0n(int wt[], int val[],int index, int k){
        // ! in knapsack 0n we have infinte chances to pick and notpick
        if(index==wt.length){
            return 0;
        }
        int pick , not_pick;
        pick=not_pick=0;
        if(wt[index]<=k){
            pick=knasack0n(wt, val, index, k-wt[index])+val[index];
        }
        not_pick=knasack0n(wt, val, index, k);
        return Math.max(pick, not_pick);
    }
    public static int knasack01(int wt[], int val[],int index, int k){
        if(index==wt.length){
            return 0;
        }
        int pick , not_pick;
        pick=not_pick=0;
        if(wt[index]<=k){
            pick=knasack01(wt, val, index+1, k-wt[index])+val[index];
        }
        not_pick=knasack01(wt, val, index+1, k);
        return Math.max(pick, not_pick);
    }
    public static void main(String[] args) {
        int wt[]={3,2,5};
        int val[]={20,40,60};
        int k=6;
        int dp[][]=new int[wt.length][k+1];
        for(int ar[]:dp){
            Arrays.fill(ar, -1);
        }
        System.out.println(dp_knapsack(wt,val,0,k,dp));
        // System.out.println(knasack0n(wt, val, 0, k));
        System.out.println(knasack01(wt, val, 0, k));
    }
}