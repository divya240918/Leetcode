import java.util.ArrayList;

public class rearrangeElements {
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                nums1.add(nums[i]);
            }
            else{
                nums2.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                nums[i] = nums2.get(i / 2);
            } else{
                nums[i] = nums1.get(i / 2);
            }
        }
        
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -4, 3, 5, -5, 2};

        int resultArray[] = rearrangeArray(nums);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
