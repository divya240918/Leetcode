import java.util.ArrayList;
import java.util.List;

public class unionArray {
    public static List<Integer> unionArray(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;

            } else if (arr2[j] < arr1[i]) {
                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;

            } else {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                    
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if ( !union.contains(arr1[i])) {
                union.add(arr1[i]);
                
            }
            i++;
        }

        while (j < n) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
                
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2 };
        int[] arr2 = { 0, 2, 4 };

        List<Integer> unitedArray = unionArray(arr1, arr2);

        for (int val : unitedArray) {
            System.out.print(val + " ");
        }
    }
}
