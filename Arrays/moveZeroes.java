public class moveZeroes {
    // BRUTE FORCE
    // public static void moveZeroesToEnd(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // int temp = arr[i];
    // for (int j = i; j < arr.length - 1; j++) {
    // arr[j] = arr[j+1];
    // }
    // arr[arr.length - 1] = temp;

    // }
    // }
    // }

    // TWO POINTER
    public static void moveZeroesToEnd(int[] arr) {
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = 1;
                break;
            }
        }

        if (j == -1)
            return;

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4 };

        moveZeroesToEnd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
