import java.util.*;
public class Preparing_Olympiad{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<(1<<n);i++){
            int sum=0;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    sum+=c[j];
                    min=Math.min(min,c[j]);
                    max=Math.max(max,c[j]);
                }
            }
            if(sum>=l && sum<=r && max-min>=x){
                count++;
            }
        }
        System.out.println(count);
    }
}