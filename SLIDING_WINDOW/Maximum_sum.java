public class Maximum_sum{
    public static void main(String[] args) {
        int ar[]={2,3,4,1,5,6,8,2,6,8,9,2,1,3};
        int k=3;
        System.out.println(maxi(ar,k));
    }
    public static int maxi(int op[] , int k){
        int ans=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=op[i];
        }
        ans=sum;
        for(int i=k;i<op.length;i++){
            sum+=op[i];
            sum-=op[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}