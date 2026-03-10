package tree.bst;

/**
 * @author : Gathsara
 * created : 3/9/2026 -- 7:33 PM
 **/

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(56);
        tree.insert(7);
        tree.inOrder();
    }
}
