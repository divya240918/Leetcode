public class linearSearch {
    public int searchElement(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 9, 11, 19};

        int target = 11;

        linearSearch obj = new linearSearch();

        int index = obj.searchElement(arr, target);

        System.out.println("Element is found at: " + index);
    }
}
