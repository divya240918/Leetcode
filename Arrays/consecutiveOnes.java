

public class consecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maximum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            maximum = Math.max(maximum, count);
        }

        return maximum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 1, 1, 1, 1 };

        consecutiveOnes obj = new consecutiveOnes();

        int consecutiveOnes = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive ones are " + consecutiveOnes);
    }
}