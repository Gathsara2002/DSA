package linear_search;

/**
 * @author : Gathsara
 * created : 2/10/2026 -- 3:43 PM
 **/

public class Main {
    public static void main(String[] args) {

        int[] arr = {23, 56, 43, 12, 44, 89, 9, 82, 49, 10, 44, 62, 79, 77};
        int target = 44;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        //1. Loop run through entire array
        for (int i = 0; i < arr.length; i++) {
            // 2. Check if current element matches target
            if (arr[i] == target) {
                return i; // FOUND IT! Return the index immediately.
            }
        }
        return -1;
    }
}
