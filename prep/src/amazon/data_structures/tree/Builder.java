package amazon.data_structures.tree;

import amazon.data_structures.Queue;

public class Builder {
    /**
     * Build tree from level order traversal and returns root node of tree.
     * 
     * @param nodes
     * @return
     * @throws Exception
     */
    public static TreeNode<String> buildTreeFromLevelOrderTraversal(String[] nodes) throws Exception {
        Queue<TreeNode<String>> queue = new Queue<TreeNode<String>>(nodes.length);
        int i=0;
        TreeNode<String> root = new TreeNode<String>(nodes[i++]);
        queue.enqueue(root);
    
        while(i<nodes.length) {
            TreeNode<String> node = queue.dequeue();
            String leftData = nodes[i++].trim();
            String rightData = i < nodes.length ? nodes[i++].trim() : "N";
            if (!leftData.equals("N")) {
                node.left(new TreeNode<String>(leftData));
                queue.enqueue(node.left());
            }
            if (!rightData.equals("N")) {
                node.right(new TreeNode<String>(rightData));
                queue.enqueue(node.right());
            }
        }

        return root;
    }
}