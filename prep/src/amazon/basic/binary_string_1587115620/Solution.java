package amazon.basic.binary_string_1587115620;

import java.math.BigInteger;

import amazon.math_utils.Combinations;
import amazon.utils.ConsoleInput;

class Solver {
    private String S;

    Solver(String S) {
        this.S = S;
    }

    public BigInteger binarySubstring() {
        BigInteger onesCount = new BigInteger("0");

        for(int i=0; i<S.length(); i++) {
            if (S.charAt(i) == '1')
                onesCount = onesCount.add(new BigInteger("1"));
        }

        return Combinations.calculateCombinations(onesCount, new BigInteger("2"));
    }
}

public class Solution {
    public static void main(String[] args) {
        int T = ConsoleInput.nextInt();

        for(int t=0; t<T; t++) {
            int length = ConsoleInput.nextInt();
            ConsoleInput.nextLine();
            String S = ConsoleInput.nextLine();
            // System.out.println(S);
            System.out.println(new Solver(S).binarySubstring());
        }
    }
}