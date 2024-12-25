import java.util.*;
public class dp1{
    public static void main(String[] args) {
        int n=5;
        int ar[]=new int[6];
        Arrays.fill(ar,0);
        System.out.println(rec(n));
        System.out.println(dp(n,ar));
        System.out.println(tabu(n));  
    }
    public static int dp(int n, int ar[]){
        if(n==0 || n==1){
            return n;
        }
        if(ar[n]!=0){
            return ar[n];
        }
        int n_1=dp(n-1,ar);
        int n_2=dp(n-2,ar);
        return ar[n]=n_1+n_2;
    }
    public static int tabu(int n){
        int ar[]=new int[n+1];
        ar[0]=0;
        ar[1]=1;
        for(int i=2;i<=n;i++){
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[n+1];
    }
    public static int rec(int n){
        if(n==0 || n==1){
            return n;
        }
        return  rec(n-1)+rec(n-2);
    }
}