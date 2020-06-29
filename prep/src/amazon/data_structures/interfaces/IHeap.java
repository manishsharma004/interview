package amazon.data_structures.interfaces;

public interface IHeap<T extends Comparable<T>> {
    public T pop();
    public void add(T item);
    public int size();
    public boolean isEmpty();
}