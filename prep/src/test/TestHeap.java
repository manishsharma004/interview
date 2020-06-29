package test;

import amazon.data_structures.heap.Heap;

public class TestHeap {
    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5};
        Heap<Integer> heap = Heap.createHeap(elements);
        while(!heap.isEmpty()) {
            System.out.print(heap.pop());
            System.out.print(" ");
        }
        System.out.println();
    }
}