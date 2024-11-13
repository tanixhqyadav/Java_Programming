import java.util.*;
public class winebechlo {
    public static void main(String[] args) {
        int wine[]={2,3,5,1,4};
        // int dp[][]=new int[][]
        System.out.println(maxa(wine));
        System.out.println(maxi_pro(wine,0,wine.length-1,1));
    }
    public static int maxa(int wine[]){
        int dp[][]=new int[wine.length][wine.length];
        int y=wine.length;
        for(int i=0;i<dp.length;i++){
            dp[i][i]=wine[i]*y;
        }
        y--;
        for(int gap=1;gap<dp.length;gap++){
            for(int j=gap;j<dp.length;j++){
                int i=j-gap;
                int f=wine[i]*y+dp[i+1][j];
                int l=wine[i]*y+dp[i][j-1];
                dp[i][j]=Math.max(f,l);
            }
            y--;
        }
        return dp[0][dp.length-1];
    }
    public static int maxi_pro(int wine[],int i ,int j,int year){
        if(i>j){
            return 0;
        }
        int f=wine[i]*year+maxi_pro(wine, i+1, j, year+1);
        int l=wine[j]*year+maxi_pro(wine, i, j-1, year+1);
        return Math.max(f,l);
    }
}
