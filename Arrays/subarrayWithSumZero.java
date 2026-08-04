import java.util.HashMap;

public class subarrayWithSumZero {

    //BRUTE FORCE
    // public static int subarrayWithSumZero(int[] nums) {
    //     int maxLen = 0;
    //     for(int i = 0; i < nums.length; i++) {
    //         for(int j = i; j < nums.length; j++) {
    //             int sum = 0;
    //             for(int k = i; k <= j; k++) {
    //                 sum += nums[k];
    //             }

    //             if(sum == 0) {
    //                 maxLen = Math.max(maxLen, j - i + 1);
    //             }
    //         }
    //     }

    //     return maxLen;
    // }

    //OPTIMAL--> HASHMAP + PREFIX SUM
    public static int subarrayWithSumZero(int[] arr) {
        int maxLen = 0;
        int n = arr.length;

        int sum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == 0) {
                maxLen += i;
            } else if(sumIndexMap.containsKey(sum)){
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            } else{
                sumIndexMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {9, -3, 3, -1, 6, -5};

        int answer = subarrayWithSumZero(nums);

        System.out.println(answer);
        
    }
}
