// ## Approach
// * Traverse the array from index 0 to n - 2.
// * Compare each element with its adjacent element (arr[i] and arr[i + 1]).
// * If arr[i] > arr[i + 1], the array is not sorted, so return false immediately.
// * If the entire array is traversed without finding any violation, return true.
// ## Time Complexity
// * O(n) – The array is traversed only once.
// ## Space Complexity
// * O(1) – No extra space is used apart from a few variables.

public class isSorted {
    public boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {52,52,59,63,73};

        isSorted obj = new isSorted();

        boolean sorted = obj.isSorted(arr);

        System.out.println(sorted);
    }
}
