package insertion_sort;

/**
 * @author : Gathsara
 * created : 2/16/2026 -- 12:35 PM
 **/

public class Main {
    public static void main(String[] args) {

        int[] arr = {23, 56, 43, 12, 44, 89, 9, 82, 49, 10, 62, 79, 77};
        int size = arr.length;

        System.out.print("Before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Start from the second element (index 1)
        for (int i = 1; i < size; i++) {

            //The element need to compare
            int key = arr[i];
            //The left element of the key
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                //shift right
                arr[j + 1] = arr[j];
                //move left to compare next
                j--;
            }
            // Insert the key into the correct position
            arr[j + 1] = key;

        }

        System.out.print("\nAfter sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
