package linked_list;

/**
 * @author : Gathsara
 * created : 2/24/2026 -- 4:19 PM
 **/

public class LinkedListDemo {
    //This is the first node of the linked list
    Node head;

    public void insert(int num) {
        //1. create a new node
        Node node = new Node(num);

        //2. add head node
        if (head == null) {
            head = node;
        }
        //3. add data to other nodes
        else {
            //create node for traverse between nodes
            Node n = head;
            //traverse
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
}
