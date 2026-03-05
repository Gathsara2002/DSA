package stack;

/**
 * @author : Gathsara
 * created : 3/5/2026 -- 8:07 PM
 **/

public class StackImplOne {

    int[] arr = new int[5];
    int top = 0;

    public void push(int value) {
        arr[top] = value;
        top++;
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
