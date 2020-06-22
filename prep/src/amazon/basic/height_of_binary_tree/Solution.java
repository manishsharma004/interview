package amazon.basic.height_of_binary_tree;

import amazon.data_structures.tree.Builder;
import amazon.data_structures.tree.TreeNode;
import amazon.utils.ConsoleInput;

class Solver<T> {
    private TreeNode<T> root;
    Solver(TreeNode<T> root) {
        this.root = root;
    }
    public int findHeight() {
        return findHeightUtil(this.root);
    }
    private int findHeightUtil(TreeNode<T> root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(findHeightUtil(root.left()), findHeightUtil(root.right())) + 1;
        }
    }
    
}

public class Solution {
    public static void main(String[] args) throws Exception {
        int T = ConsoleInput.nextInt();
        ConsoleInput.nextLine();

        for(int t=0; t<T; t++) {
            String[] nodes = ConsoleInput.nextLine().split(" ");
            TreeNode<String> root = Builder.buildTreeFromLevelOrderTraversal(nodes);
            System.out.println(new Solver<String>(root).findHeight());
        }
    }
}
