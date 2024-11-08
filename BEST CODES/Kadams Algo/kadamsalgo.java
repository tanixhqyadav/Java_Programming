public class kadamsalgo {
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
                sum+=nums[i];
                ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ar[]={2,3-7,4,-1,9};
        System.out.println(maxSubArray(ar));
    }
}
