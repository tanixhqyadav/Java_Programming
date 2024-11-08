public class difo{
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        System.out.println();
    }
    public int fibo(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int n_1=fibo(n-1,dp);
        int n_2=fibo(n-2,dp);
        return dp[n]=n_1+n_2;
    }
}