package bubble_sort;

/**
 * @author : Gathsara
 * created : 2/11/2026 -- 6:31 AM
 **/

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 56, 43, 12, 44, 89, 9, 82, 49, 10, 62, 79, 77};

        System.out.print("Before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Outer loop: One pass for each element
        for (int i = 0; i < arr.length; i++) {

            // Inner loop: The actual comparison and swapping
            // We stop at (n - 1 - i) because the end is already sorted!
            for (int j = 0; j < arr.length - 1 - i; j++) {

                //Compare adjacent values and swap (if needed)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        System.out.print("\nAfter sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
