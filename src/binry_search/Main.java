package binry_search;

import static java.util.Arrays.binarySearch;

/**
 * @author : Gathsara
 * created : 2/10/2026 -- 4:16 PM
 **/

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearchAlgorithm(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int binarySearchAlgorithm(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //Find mid
            int mid = (start + end) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;

                // If target is greater, ignore left half
            } else if (arr[mid] < target) {
                start = mid + 1;

                // If target is smaller, ignore right half
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
