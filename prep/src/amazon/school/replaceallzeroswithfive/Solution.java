package amazon.school.replaceallzeroswithfive;

import amazon.utils.ConsoleInput;

class Solver {
    int convertFive(int N) {
        int exp = 1;
        if (N == 0) {
            return 5;
        }

        while(exp <= N) {
            if (getDigit(N, exp) == 0) {
                N += 5 * exp;
            }
            exp *= 10;
        }

        return N;
    }

    private static int getDigit(int num, int exp) {
        return (num % (exp*10)) / exp;
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

            System.out.println(new Solver().convertFive(N));
        }
    }
}