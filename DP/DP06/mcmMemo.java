import java.sql.Array;
import java.util.*;

public class mcmMemo {
    public static void main(String[] args) {
        int hr[] = { 1, 2, 3, 4, 3 };
        int dp[][] = new int[hr.length][hr.length];
        for (int ar[] : dp) {
            Arrays.fill(ar,-1);
        }
        System.out.println(helper(hr, 1,hr.length-1,dp));
    }

    public static int helper(int op[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = helper(op, i, k,dp);
            int cost2 = helper(op, k + 1, j,dp);
            int cost3 = op[i - 1] * op[k] * op[j];
            int finalcost = cost1 + cost2 + cost3;
             ans = Math.min(ans, finalcost);
        }
        return dp[i][j]=ans;
    }
}
