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
        queue.dequeue();
        queue.show();
        queue.enqueue(56);
        queue.show();

        queue.enqueue(80);
        queue.show();

        System.out.println(queue.size);
        System.out.println(queue.isFul());
        System.out.println(queue.isEmpty());
    }
}
