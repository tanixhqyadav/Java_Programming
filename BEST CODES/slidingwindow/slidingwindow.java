public class slidingwindow {
    public static int maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int maxSum = 0;
        int winSum = 0;
        for (int i = 0; i < k; i++) {
            winSum += nums[i];
        }
        maxSum = winSum;
        for (int i = k; i < n; i++){
            winSum = winSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, winSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] ={2, 9, 31, -4, 21, 7 };
        int k = 3;
        int result = maxSubarraySum(nums, k);
        System.out.println("Maximum Sum Subarray: " + result);
    }
}
