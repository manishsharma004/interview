package amazon.data_structures.tree;

import java.util.ArrayList;

public class Walker {
    public static <T> void printInOrderTraversal(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        printInOrderTraversal(root.left());
        System.out.print(root.data() + " ");
        printInOrderTraversal(root.right());
    }
    public static <T> ArrayList<T> inOrderTraversal(TreeNode<T> root) {
        ArrayList<T> traversal = new ArrayList<T>();

        if (root != null) {
            traversal.addAll(inOrderTraversal(root.left()));
            traversal.add(root.data());
            traversal.addAll(inOrderTraversal(root.right()));
        }

        return traversal;
    }
}