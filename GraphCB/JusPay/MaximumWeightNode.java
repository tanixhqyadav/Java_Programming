import java.util.*;
public class MaximumWeightNode{
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int n=jk.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=jk.nextInt();
        }
        int hr[]=new int[n];
        for(int i=0;i<n;i++){
            if(ar[i]>-1){
                hr[ar[i]]+=i;
            }
        }
        int op=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<=hr[i]){
                max=hr[i];
                op=i;
            }
        }
        System.out.println(op);
    }
}