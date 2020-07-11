package amazon.basic.rotate_matrix;

import amazon.utils.ConsoleInput;

class Solver {
    private int[][] matrix;

    public Solver(int[][] matrix) {
        this.matrix = matrix;
    }

    public void transpose() {
        int N = matrix.length;

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                swap(i, j, j, i);
            }
        }
    }

    public void rotate() {
        int N = matrix.length;

        for(int i=0; i<N/2; i++) {
            for(int j=0; j<N/2; j++) {
                rotateIndex(i, j);
            }
            if (N % 2 == 1) {
                rotateIndex(i, N/2);
            }
        }
        if (N % 2 == 1) {
            rotateIndex(N/2, N/2);
        }
    }

    private void rotateIndex(int i, int j) {
        int start = matrix[i][j];
        int row = i, col = j;
        for(int k=0; k<3; k++) {
            int nextRow = nextRotatedRow(row, col),
                nextCol = nextRotatedCol(row, col);
            matrix[row][col] = matrix[nextRow][nextCol];
            row = nextRow;
            col = nextCol;
        }
        matrix[row][col] = start;
    }

    private int nextRotatedRow(int currentRow, int currentCol) {
        return currentCol;
    }

    private int nextRotatedCol(int currentRow, int currentCol) {
        return matrix.length - 1 - currentRow;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void printMatrix() {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if (j != matrix[i].length-1)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.println(matrix[i][j]);
            }
        }
    }

    private void swap(int x1, int y1, int x2, int y2) {
        int val1 = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = val1;
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();
        
        for(int t=0; t<T; t++) {
            int N = ConsoleInput.nextInt();

            int[][] matrix = new int[N][N];

            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    matrix[i][j] = ConsoleInput.nextInt();
                }
            }

            Solver solver = new Solver(matrix);
            solver.rotate();
            solver.printMatrix();
        }
    }
}