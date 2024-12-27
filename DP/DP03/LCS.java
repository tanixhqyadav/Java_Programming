import java.util.*;
public class LCS{
    public static void main(String[] args) {
        String rt="abcdefgh";
        String ty="acezxfg";
        System.out.println(recDp(rt, ty, rt.length()-1, ty.length()-1));
        LcsBu(rt,ty);
    }
    public static int recDp(String st1, String st2, int i , int j){
        if(i==0 || j==0){
            return 0;
        }
        int ip=0;
        int op=0;
        if(st1.charAt(i)==st2.charAt(j)){
            ip=1+recDp(st1, st2, i-1, j-1);
        }
        else{
            op=Math.max(recDp(st1, st2, i-1, j),recDp(st1, st2, i, j-1));
        }
        return Math.max(ip,op);
    }
    public static int LCS(String s1 , String s2,int i , int j,int dp[][]){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+LCS(s1,s2,i+1,j+1,dp);
        }else{
            int f=LCS(s1,s2,i+1,j,dp);
            int x=LCS(s1,s2,i,j+1,dp);
            ans=Math.max(f,x);
        }
        return dp[i][j]=ans;
    }
    public static void LcsBu(String s1, String s2){
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int c=dp[i-1][j];
                    int v=dp[i][j-1];
                    dp[i][j]=Math.max(c,v);
                }
            }
        }
        // return dp[s1.length()][s2.length()];
        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}