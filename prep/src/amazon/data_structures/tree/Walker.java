package amazon.data_structures.tree;

public class Walker {
    public static void preOrderTraversal(TreeNode<String> root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left());
        System.out.print(root.data() + " ");
        preOrderTraversal(root.right());
    }
}