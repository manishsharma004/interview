package amazon.basic.sorted_matrix;

import java.util.ArrayList;

import amazon.data_structures.heap.Heap;
import amazon.utils.ConsoleInput;

class HeapNode<T extends Comparable<T>> implements Comparable<HeapNode<T>> {
    private T data;
    private int row;
    private int col;

    HeapNode(int row, int col, T data) {
        this.row = row;
        this.col = col;
        this.data = data;
    }

    @Override
    public int compareTo(HeapNode<T> o) {
        return data.compareTo(o.data);
    }

    public T getData() {
        return data;
    }

    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return data != null ? data.toString() : "";
    }
}

class Solver {
    private Integer[][] matrix;

    public Solver(Integer[][] matrix) {
        this.matrix = matrix;
    }
    private HeapNode<Integer> node(int row, int col) {
        HeapNode<Integer> node = new HeapNode<Integer>(row, col, matrix[row][col]);

        matrix[row][col] = -1;

        return node;
    }
    public ArrayList<Integer> printSorted() {
        ArrayList<Integer> output = new ArrayList<Integer>();
        Heap<HeapNode<Integer>> heap = Heap.createHeap();
        heap.add(node(0, 0));

        while(!heap.isEmpty()) {
            HeapNode<Integer> current = heap.pop();
            int row = current.getRow();
            int column = current.getCol();

            output.add(current.getData());
            
            if (column != matrix.length-1) {
                HeapNode<Integer> right = right(row, column);
                if (right.getData() != -1) {
                    heap.add(right);
                }
            }
            if (row != matrix.length-1) {
                HeapNode<Integer> below = below(row, column);
                if (below.getData() != -1) {
                    heap.add(below);
                }
            }
        }
        return output;
    }
    private HeapNode<Integer> right(int row, int column) {
        column = column + 1;
        return node(row, column);
    }
    private HeapNode<Integer> below(int row, int column) {
        row = row + 1;
        return node(row, column);
    }
}

public class Solution {
    public static void main(String[] args) {
        int T = ConsoleInput.nextInt();
        for(int t=0; t<T; t++) {
            int n = ConsoleInput.nextInt();
            Integer[][] matrix = new Integer[n][n];
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    matrix[i][j] = ConsoleInput.nextInt();
                }
            }

            System.out.println(new Solver(matrix).printSorted());
        }
    }
}