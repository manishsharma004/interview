package amazon.basic.inorder_traversal;

import java.util.ArrayList;

import amazon.data_structures.tree.Builder;
import amazon.data_structures.tree.TreeNode;
import amazon.data_structures.tree.Walker;
import amazon.utils.ConsoleInput;
import amazon.utils.Printer;

class Solver<T> {
    private TreeNode<T> root;

    Solver(TreeNode<T> root) {
        this.root = root;
    }
    public void inOrder() {
        ArrayList<T> traversal = Walker.inOrderTraversal(root);
        System.out.println(traversal);
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        int T = ConsoleInput.nextInt();
        ConsoleInput.nextLine();

        for(int t=0; t<T; t++) {
            String[] nodes = ConsoleInput.nextLine().split(" ");
            TreeNode<String> root = Builder.buildTreeFromLevelOrderTraversal(nodes);
            new Solver<String>(root).inOrder();
        }
    }
}