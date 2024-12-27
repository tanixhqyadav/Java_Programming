import java.util.*;
public class unboundedKnapsack {
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int cap=7;
        int cp[][]=new int[val.length][cap+1];
        for(int y[]:cp){
            Arrays.fill(y,-1);
        }
        System.out.println(unbounded(val, wt, val.length-1, cap, cp));
    }
    public static int unbounded(int val[], int wt[], int i , int cap, int cp[][]){
        if(i<0 || cap==0){
            return 0;
        }
        if(cp[i][cap]!=-1){
            return cp[i][cap]; 
        }
        int in=0;
        int ex=0;
        if(wt[i]<=cap){
            in=val[i]+unbounded(val, wt, i, cap-wt[i], cp);
        }
        ex=unbounded(val, wt, i-1, cap, cp);
        return cp[i][cap]=Math.max(in,ex);
    }

}