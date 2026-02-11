package selection_sort;

/**
 * @author : Gathsara
 * created : 2/11/2026 -- 7:29 AM
 **/

public class Main {
    public static void main(String[] args) {

        int[] arr = {23, 56, 43, 12, 44, 89, 9, 82, 49, 10, 62, 79, 77};
        int size = arr.length;
        int temp = 0;
        int minIndex = -1;

        System.out.print("Before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        //passes
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;

            //find minimum index
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            //swap
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("\nAfter sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
