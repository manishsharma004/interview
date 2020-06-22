package amazon.data_structures;

import amazon.data_structures.interfaces.IQueue;

public class Queue<T> implements IQueue<T> {

    private Object[] container;
    private int front = -1;
    private int back = -1;

    public Queue(int size) {
        this.container = new Object[size];
    }

    @Override
    public void enqueue(T el) throws Exception {
        // Queue is empty
        if (front == -1) {
            front = 0;
            back = 1;
            container[front] = el;
        }
        // Queue is full
        else if (front == back) {
            throw new Exception("Queue is full");
        } else {
            container[back] = el;
            back = nextPos(back);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public T dequeue() throws Exception {
        if (front == -1) {
            throw new Exception("Queue is empty");
        } else {
            T el = (T) container[front];
            front = nextPos(front);
            if (front == back) {
                front = back = -1;
            }

            return el;
        }
    }

    

    @SuppressWarnings("unchecked")
    public void print() {
        print("");
        if (front > -1) {
            for(int i=front; i != back; i = nextPos(i)) {
                print(((T) container[i]));
                if (nextPos(i) != back)
                    print(" <- ");
            }
        }
        print("\n");
    }

    private int nextPos(int index) {
        return (index+1) % container.length;
    }

    private void print(Object str) {
        System.out.print(str);
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return !isEmpty() && front == back;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peekFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return (T) container[front];
    }
}