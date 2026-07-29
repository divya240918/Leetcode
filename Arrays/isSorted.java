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
