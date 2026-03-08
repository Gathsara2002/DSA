package queue;

/**
 * @author : Gathsara
 * created : 3/8/2026 -- 12:49 PM
 **/

public class QueueImpl {
    int[] arr = new int[5];
    int size;
    int front = 0;
    int rear = 0;

    public void enqueue(int value) {
        arr[rear] = value;
        rear = (rear + 1) % 5;
        size = size + 1;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % 5] + " ");
        }
        System.out.println();
    }

    public int dequeue() {
        int data = arr[front];
        front = (front + 1) % 5;
        size--;
        return data;
    }
}
