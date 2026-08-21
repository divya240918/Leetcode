public class subarray {
    public static void subarrayWithMaxSum(int[] nums) {
        int start = 0;
        int end = 0;

        int minPrefixIndex = -1;

        int prefixSum = 0;
        int minPrefixSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int currentSum = prefixSum - minPrefixSum;
            if(currentSum > maxSum) {
                maxSum = prefixSum;
                start = minPrefixIndex + 1;

                end = i;
            }

            if(minPrefixSum > prefixSum) {
                minPrefixSum = prefixSum;
                minPrefixIndex = i;
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};

        subarrayWithMaxSum(nums);

    }
}
