package amazon.basic.preorder_traversal;

import java.util.ArrayList;

import amazon.data_structures.tree.Builder;
import amazon.data_structures.tree.TreeNode;
import amazon.data_structures.tree.Walker;
import amazon.utils.ConsoleInput;

class Solver<T extends CharSequence> {
    private TreeNode<T> root;

    public Solver(TreeNode<T> root) {
        this.root = root;
    }

    public void preOrderTraversal() {
        ArrayList<T> path = Walker.preOrderTraversal(root);
        System.out.println(String.join(" ", path));
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        solve();
    }

    private static void solve() throws Exception {
        int T = ConsoleInput.nextInt();
        ConsoleInput.nextLine();
        for(int t=0; t<T; t++) {
            String[] treeData = ConsoleInput.nextLine().split(" ");
            TreeNode<String> treeRoot = Builder.buildTreeFromLevelOrderTraversal(treeData);
            
            new Solver<String>(treeRoot).preOrderTraversal();
        }
    }
}