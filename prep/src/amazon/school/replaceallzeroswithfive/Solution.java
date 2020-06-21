package amazon.school.replaceallzeroswithfive;

import amazon.utils.ConsoleInput;

class Solver {
    private int N;

    Solver(int N) {
        this.N = N;
    }

    int convertFive() {
        int exp = 1;
        if (N == 0) {
            return 5;
        }

        while(exp <= N) {
            if (getDigit(exp) == 0) {
                N += 5 * exp;
            }
            exp *= 10;
        }

        return N;
    }

    private int getDigit(int exp) {
        return (N % (exp*10)) / exp;
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();

        for (int t=0; t<T; t++) {
            int N = ConsoleInput.nextInt();

            System.out.println(new Solver(N).convertFive());
        }
    }
}