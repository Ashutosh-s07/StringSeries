public class MaximumGoodSubarraySum{
    public static long maximumSubarraySum(int[] nums, int k) {
        int endIndex = 0;
        int currMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], nums[i] + currMax);
            if (currMax > globalMax) {
                globalMax = currMax;
                endIndex = i;
            }
        }

        int startIndex = endIndex;
        while (startIndex >= 0) {
            globalMax -= nums[startIndex];
            if (globalMax == 0) {
                break;
            }
            startIndex--;
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4};
        int k = 2;
        System.out.println(maximumSubarraySum(nums, k));

    }
}