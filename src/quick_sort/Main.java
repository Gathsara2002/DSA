package quick_sort;

/**
 * @author : Gathsara
 * created : 2/16/2026 -- 5:02 PM
 **/

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 56, 43, 12, 44, 89, 9, 82, 49, 10, 62, 79, 77};

        System.out.print("Before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.print("\nAfter sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low  --> Starting index,
    // high --> Ending index
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // This function takes the last element as pivot, places
    // the pivot element at its correct position in sorted array,
    // and places all smaller (smaller than pivot) to left of pivot
    // and all greater elements to right of pivot
    private static int partition(int[] arr, int low, int high) {

        // Choosing the last element as Pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index where the pivot landed
        return i + 1;
    }

}
