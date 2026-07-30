import java.util.HashSet;

public class removeDuplicateUsingHashset {
    public static int removeDuplicate(int nums[]) {
        HashSet<Integer> seen = new HashSet<>();

        int index = 0;

        for(int num : nums) {
            if( !seen.contains(num) ) {
                seen.add(num);

                nums[index] = num;

                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4};

        int uniqueElements = removeDuplicate(nums);

        System.out.println("Unique Elements : " + uniqueElements);

        for(int i = 0; i < nums.length; i++) {
            System.out.print( nums[i] + " ");
        }
    }

}
