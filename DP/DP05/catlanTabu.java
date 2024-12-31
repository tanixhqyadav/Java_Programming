import java.util.*;


public class catlanTabu {
    public static void main(String[] args) {
        int lx=5;
        System.out.println(tabu(lx));
    }
    public  static int tabu(int op){
        int dp[]=new int[op+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=op;i++){
            int ans=0;
            for(int j=0;j<i;j++){
                ans+=dp[j]*dp[i-j-1];
            }
            dp[i]=ans;
        }
        return dp[op];
    }
}
