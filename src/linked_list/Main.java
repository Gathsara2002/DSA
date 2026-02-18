package linked_list;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 2/18/2026 -- 7:35 AM
 **/

// A simple Java class to represent a Node
class Node {
    int data;       // The value
    Node next;      // The "Note" pointing to the next node

    Node(int data) {
        this.data = data;
        this.next = null; // By default, it points to nothing (End of the line)
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Create 3 separate nodes (Floating in memory)
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Right now:
        // [10|null]   [20|null]   [30|null]

        // 2. Link them together!
        head.next = second; // 10 points to 20
        second.next = third; // 20 points to 30

        // Now:
        // [10|•] -> [20|•] -> [30|null]

        // "head" is our starting clue.
        // "third.next" is null, which means "The End".

    }
}
