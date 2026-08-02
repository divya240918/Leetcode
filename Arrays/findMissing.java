public class findMissing {
    public int findMissingNum(int[] arr) {

        int actualSum = 0;

        int n = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int expectedSum = n * (n + 1)/2;

        int missingNum = expectedSum - actualSum;

        return missingNum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8};

        findMissing obj = new findMissing();

        int missingNum = obj.findMissingNum(arr);

        System.out.println("Missing number is: " + missingNum);
    }
}
