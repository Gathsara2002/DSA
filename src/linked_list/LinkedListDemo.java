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

    public void show() {
        Node temp = head;

        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertAtFirst(int num) {
        Node n = new Node(num);

        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void insertAt(int index, int num) {
        Node node = new Node(num);

        Node n = head;

        if (index == 0) {
            insertAtFirst(num);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node temp = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            System.out.println(temp.data);
        }
    }
}
