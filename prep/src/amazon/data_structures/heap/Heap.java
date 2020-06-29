package amazon.data_structures.heap;

import java.util.ArrayList;

import amazon.data_structures.interfaces.IHeap;

public class Heap<T extends Comparable<T>> implements IHeap<T> {

    private ArrayList<T> container;
    
    private Heap(T[] elements) {
        container = new ArrayList<T>(elements.length);
        for(T e: elements) {
            container.add(e);
        }
    }
    private Heap(ArrayList<T> container) {
        this.container = container;
    }

    public static <E extends Comparable<E>> Heap<E> createHeap() {
        return new Heap<E>(new ArrayList<E>());
    }

    public static <E extends Comparable<E>> Heap<E> createHeap(E[] elements) {
        Heap<E> heap = new Heap<E>(elements);
        int size = heap.container.size();

        for(int i=size/2; i>=0; i--) {
            heap.maxHeapify(i);
        }

        return heap;
    }

    private void maxHeapify(int root) {
        // Invalid `root` (cannot be negative index or out of array index range)
        if (root < 0 || root >= container.size()) {
            return;
        }
        int left = root*2 + 1;
        int right = left+1;

        // `root` has no children, so already a max-heap
        if (left >= container.size() && right >= container.size()) {
            return;
        }

        int largest = root;
        if (left < container.size() && container.get(largest).compareTo(container.get(left)) > 0) {
            largest = left;
        }
        if (right < container.size() && container.get(largest).compareTo(container.get(right)) > 0) {
            largest = right;
        }
        if (root != largest) {
            swap(root, largest);
            maxHeapify(largest);
        }
    }

    private void swap(int left, int right) {
        T temp = container.get(left);
        container.set(left, container.get(right));
        container.set(right, temp);
    }

    @Override
    public T pop() {
        T top = container.get(0);
        int lastIndex = container.size()-1;
        container.set(0, container.get(lastIndex));
        container.remove(lastIndex);
        if (container.size() > 0) {
            maxHeapify(0);
        }
        return top;
    }

    @Override
    public void add(T item) {
        int root = container.size();       
        container.add(item);

        while (root > 0) {
            maxHeapify(root);
            root = root / 2;
        }
        maxHeapify(root);
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public boolean isEmpty() {
        return container.isEmpty();
    }

    public void printContainer() {
        for(int i=0; i<container.size(); i++) {
            System.out.print(container.get(i).toString() + " ");
        }
        System.out.println();
    }
}