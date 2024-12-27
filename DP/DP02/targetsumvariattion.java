public class targetsumvariattion{
    public static void main(String[] args) {
        // TC O(n x Sum)
        int ar[]={4,2,7,1,3};
        int r=10;
        boolean dp[][]=new boolean[ar.length+1][r+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        // for(int i=1;i<dp.length;i++){
        //     for(int j=1;j<=r;j++){
        //         if(ar[i-1]<=j && dp[i-1][j-ar[i-1]]){
        //             dp[i][j]=true;
        //         }
        //         else if(dp[i-1][j]=true){
        //             dp[i][j]=true;
        //         }
        //     }
        // }
        // System.out.println(dp[dp.length-1][r]);
        System.out.println(recdp(ar, r, ar.length, dp));
    }
    public static boolean recdp(int ar[],int r, int i, boolean dp[][]){
        if(r==0){
            return true;
        }
        if(i==0){
            return false;
        }
        if(dp[i][r]){
            return true;
        }
        if(r<=ar[i-1]){
            dp[i][r]=recdp(ar, r-ar[i-1], i-1, dp) || recdp(ar,r,i-1,dp);
        }
        else{
            dp[i][r]=recdp(ar, r, i-1, dp);
        }
        return dp[i][r];
    }
}