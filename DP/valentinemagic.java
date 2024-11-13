import java.util.*;
public class valentinemagic {
    public static void main(String[] args) {
        int by[]={2,11,3};
        int gir[]={5,7,3,2};
        Arrays.sort(by);
        Arrays.sort(gir);
        int dp[][]=new int[by.length][gir.length];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        System.out.println(mini_dif(by, gir, 0, 0));
        System.out.println(mini_difdp(by, gir, 0, 0,dp));
    }
    public static int mini_dif(int by[],int gir[],int i, int j){
        if(i==by.length){
            return 0;
        }
        if(j==gir.length){
            return 66666;
        }
        int sel=Math.abs(by[i]-gir[j])+mini_dif(by, gir, i+1, j+1);
        int rej=mini_dif(by, gir, i, j+1);
        return Math.min(sel,rej);
    }
    public static int mini_difdp(int by[],int gir[],int i, int j,int dp[][]){
        if(i==by.length){
            return 0;
        }
        if(j==gir.length){
            return 66666;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int sel=Math.abs(by[i]-gir[j])+mini_dif(by, gir, i+1, j+1);
        int rej=mini_dif(by, gir, i, j+1);
        return dp[i][j]=Math.min(sel,rej);
    }
}
