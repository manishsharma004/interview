package amazon.data_structures.interfaces;

public interface IQueue<T> {
    void enqueue(T el) throws Exception;
    T dequeue() throws Exception;
    boolean isEmpty();
    boolean isFull();
    T peekFront() throws Exception;
}