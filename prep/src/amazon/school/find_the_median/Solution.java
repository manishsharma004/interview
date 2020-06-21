package amazon.school.find_the_median;

import java.util.Arrays;

import amazon.utils.ConsoleInput;

class Solver {
    private int[] input;

    Solver(int[] input) {
        this.input = input;
    }

    public double fintMedianWithSort() {
        Arrays.sort(input);
        if (input.length % 2 == 1) {
            return input[input.length/2];
        } else {
            return input[input.length/2-1] + (input[input.length/2] - input[input.length/2 - 1]) / 2.0;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();
        ConsoleInput.nextLine();
        for(int t=0; t<T; t++) {
            int N = ConsoleInput.nextInt();
            int[] numbers = new int[N];
            for(int i=0; i<N; i++) {
                numbers[i] = ConsoleInput.nextInt();
            }

            System.out.println(new Solver(numbers).fintMedianWithSort());
        }
    }
}
