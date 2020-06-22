package amazon.data_structures.tree;

public class TreeNode<T> {
    private TreeNode<T> _left;
    private TreeNode<T> _right;
    private T _data;

    TreeNode(T _data) {
        this._data = _data;
    }

    public TreeNode<T> left() {
        return _left;
    }
    public void left(TreeNode<T> left) {
        this._left = left;
    }
    public TreeNode<T> right() {
        return _right;
    }
    public void right(TreeNode<T> right) {
        this._right = right;
    }
    public T data() {
        return _data;
    }
    public void data(T data) {
        this._data = data;
    }
}
