package stack;

/**
 * @author : Gathsara
 * created : 3/6/2026 -- 7:49 PM
 **/

public class StackImplTwo {
    int capacity = 2;
    int[] arr = new int[capacity];
    int top = 0;

    public void push(int value) {
        if (size() == capacity) {
            expand();
        }
        arr[top] = value;
        top++;
    }

    private void expand() {
        int length = size();
        int[] tempArray = new int[capacity * 2];
        System.arraycopy(arr, 0, tempArray, 0, length);
        arr = tempArray;
        capacity *= 2;
    }

    public void show() {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public void pop() {
        top--;
        int data = arr[top];
        arr[top] = 0;
        // If the stack is 25% full or less, AND it's bigger than our starting size, HALVE it
        // Note: top is an index, so the number of elements is top + 1
        if (capacity > 2 && (top + 1) <= capacity / 4) {
            resize(capacity / 2);
        }
    }

    private void resize(int newCapacity) {
        System.out.println("Resizing array from " + capacity + " to " + newCapacity);
        int[] newArr = new int[newCapacity];

        // Copy existing elements to the new array
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr; // Swap the old array out for the new one
        capacity = newCapacity;
    }

    public int peek() {
        return arr[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
