import java.util.*;
public class mcmRecursion{
    public static void main(String[] args) {
        int op[]={1,2,3,4,3};
        System.out.println(helper(op, 1,op.length-1));
    }
    public static int helper(int op[], int i ,int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=helper(op, i,k);
            int cost2=helper(op,k+1,j);
            int cost3=op[i-1]*op[k]*op[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans, finalcost);
        }
        return ans;
    }
}