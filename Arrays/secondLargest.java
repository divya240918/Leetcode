// ## Approach
// * Initialize two variables: largest and secondLargest.
// * Traverse the array once.
// * If the current element is greater than largest:
// * Update secondLargest with the previous value of largest.
// * Update largest with the current element.
// * Otherwise, if the current element is smaller than largest but greater than secondLargest, update secondLargest.
// * After completing the traversal, return secondLargest. If no valid second largest element exists, return -1.
// ## Time Complexity
// * O(n) – The array is traversed only once.
// ## Space Complexity
// * O(1) – Only two extra variables are used.

public class secondLargest {
    public int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } 
            else if(arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    public static void main(String[] args) {
        int[] arr = {57, 34, 47, 28, 19};

        secondLargest obj = new secondLargest();
        int sLargest = obj.secondLargest(arr);

        System.err.println(sLargest);
    }
}
