package amazon.school.replaceallzeroswithfive;

import amazon.utils.ConsoleInput;

class Solver {
    int convertFive(int N) {
        String strN = N + "";
        int output = 0;
        for(int i=0; i<strN.length(); i++) {
            output *= 10;
            output += isZero(strN, i) ? 5 : charToInt(strN, i);
        }

        return output;
    }

    static boolean isZero(String num, int index) {
        return num.charAt(index) == '0';
    }

    static int charToInt(String num, int index) {
        return num.charAt(index) - 48;
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