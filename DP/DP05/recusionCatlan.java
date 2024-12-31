import java.util.*;
public class recusionCatlan {
    public static void main(String[] args) {
        int n=5;
        // ! for n=30 the system hanged so we need dp to memoize it and solve the overlapping problem 
        System.out.println(cat(n));
    }
    public static int cat(int n){
        if(n==1 || n==0){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=cat(i)*cat(n-i-1);
        }
        return ans;
    }
}
