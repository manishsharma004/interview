package amazon.basic.rotate_array_by_n_elements;

import amazon.math_utils.Gcd;
import amazon.utils.ConsoleInput;
import amazon.utils.Printer;

class Solver<T> {
    private T[] array;

    Solver(T[] array) {
        this.array = array;
    }

    public T[] rotate(int d) {
        reverse(0, d-1);
        reverse(d, array.length-1);
        reverse(0, array.length-1);

        return array;
    }

    public T[] rotateJuggling(int d) {
        int gcd = Gcd.calculate(array.length, d);

        for(int i=0; i<gcd; i++) {
            int start = i;
            T temp = array[start];

            do {
                int nextIndex = (start + d) % array.length;
                array[start] = array[nextIndex];
                start = nextIndex;
            }
            while (start != i);
            array[(start - d + array.length) % array.length] = temp;
        }

        return array;
    }

    private void reverse(int start, int end) {
        int size = end - start + 1;
        for(int i=0; i<size/2; i++) {
            T temp = array[start+i];
            array[start+i] = array[end-i];
            array[end-i] = temp;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        int T = ConsoleInput.nextInt();

        for(int t=0; t<T; t++) {
            int N = ConsoleInput.nextInt();
            int D = ConsoleInput.nextInt();
            Integer[] numbers = new Integer[N];

            for(int i=0; i<N; i++) {
                numbers[i] = ConsoleInput.nextInt();
            }

            Printer.printArray(new Solver<Integer>(numbers).rotateJuggling(D), "", false);
        }
    }
}