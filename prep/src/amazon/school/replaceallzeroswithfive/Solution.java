package amazon.school.replaceallzeroswithfive;

import amazon.utils.ConsoleInput;

class Solver {
    int convertFive(int N) {
        if (N < 10)
            return return5if0(N);

        return convertFive(N/10)*10 + return5if0(N);
    }

    private static int return5if0(int num) {
        return (num%10 == 0) ? 5 : num%10;
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