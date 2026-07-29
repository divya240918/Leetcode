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
