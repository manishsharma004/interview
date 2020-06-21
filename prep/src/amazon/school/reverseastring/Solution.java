package amazon.school.reverseastring;

import amazon.utils.ConsoleInput;

class Solver {
    public String reverseString(String sourceString) {
        if (sourceString.length() < 2) {
            return sourceString;
        }

        return reverseString(sourceString.substring(1)) + sourceString.substring(0, 1);
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }
    private static void solve() {
        int N = ConsoleInput.nextInt();
        ConsoleInput.nextLine(); // Remove \n from buffer

        while(N-- > 0) {
            String S = ConsoleInput.nextLine();
            System.out.println(new Solver().reverseString(S));
        }
    }
}