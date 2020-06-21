package amazon.school.value_equal_to_index_value;

import amazon.utils.ConsoleInput;

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();
        for(int t=0; t<T; t++) {
            int N = ConsoleInput.nextInt();
            int[] numbers = new int[N];
            for(int i=0; i<N; i++) {
                numbers[i] = ConsoleInput.nextInt();
            }

            new Solver(numbers).solve();
        }
    }
}

class Solver {
    private int[] array;

    Solver(int[] array) {
        this.array = array;
    }

    public void solve() {

        for(int i=0; i<array.length; i++) {
            if (array[i] == i+1) {
                System.out.print((i+1) + " ");
            }
        }

        System.out.println();
    }
}