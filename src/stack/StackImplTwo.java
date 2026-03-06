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
