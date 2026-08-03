public class singleNumber {
    //BRUTE FORCE
    // public int singleNumber(int[] nums) {
    //     for(int i = 0; i < nums.length; i++) {
    //         int count = 0;
    //         for(int j = 0; j < nums.length; j++) {
    //             if(nums[j] == nums[i]) {
    //                 count++;
    //             }
    //         }
    //         if(count == 1) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    public int singleNumber(int[] nums) {
        int xorr = 0;

        for(int num : nums){
            xorr ^= num;
        }

        return xorr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};

        singleNumber obj = new singleNumber();

        int answer = obj.singleNumber(arr);

        System.out.println(answer);
    }
}
