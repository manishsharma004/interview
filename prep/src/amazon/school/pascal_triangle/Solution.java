package amazon.school.pascal_triangle;

import amazon.utils.ConsoleInput;
import amazon.utils.Printer;

class Solver {
    private int K;
    private int[] pascalArray;

    Solver(int K) {
        this.K = K;
        this.pascalArray = new int[K];
        for(int i=0; i<K; i++)
            pascalArray[i] = 0;
    }

    public void printPascalTriangle() {
        
        int i=0;
        setElement(i, 1);
        printArray(i);
        i++;
        while(i<K) {
            for(int j=K-1-i; j<K-1; j++) {
                updateArrayAt(j);
            }
            printArray(i);
            i++;
        }
    }

    private void setElement(int index, int value) {
        pascalArray[K-1-index] = value;
    }
    private void printArray(int index) {
        System.out.print(spaces(K -1 -index));
        Printer.printArray(pascalArray, K -1 -index, K);
    }
    private void updateArrayAt(int index) {
        pascalArray[index] += pascalArray[index+1];
    }

    private static String spaces(int count) {
        StringBuilder sb = new StringBuilder();
        while(count-- > 0) {
            sb.append("   ");
        }
        return sb.toString();
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();

        for(int t=0; t<T; t++) {
            int K = ConsoleInput.nextInt();

            new Solver(K).printPascalTriangle();
        }
    }
}
