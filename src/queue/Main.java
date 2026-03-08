package queue;

/**
 * @author : Gathsara
 * created : 3/8/2026 -- 12:40 PM
 **/

public class Main {
    public static void main(String[] args) {

        QueueImpl queue = new QueueImpl();
        queue.enqueue(4);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(12);
        queue.show();
    }
}
