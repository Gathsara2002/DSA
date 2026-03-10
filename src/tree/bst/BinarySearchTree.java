package tree.bst;

/**
 * @author : Gathsara
 * created : 3/9/2026 -- 7:39 PM
 **/

public class BinarySearchTree {

    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    public Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else if (root.data > value) {
            root.left = insertRec(root.left, value);
        } else if (root.data < value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}
