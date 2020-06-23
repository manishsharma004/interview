package amazon.math_utils;

import java.math.BigInteger;

public class Combinations {
    public static int calculateCombinations(int n, int r) {
        if (n == 0) {
            return 0;
        }

        return factorial(n) / factorial(n-r) / factorial(r);
    }
    public static BigInteger calculateCombinations(BigInteger n, BigInteger r) {
        if (n.equals(new BigInteger("0"))) {
            return new BigInteger("0");
        }

        return factorial(n).divide(factorial(n.subtract(r))).divide(factorial(r));
    }

    private static int factorial(int n) {
        return Factorial.factorial(n);
    }
    private static BigInteger factorial(BigInteger n) {
        return Factorial.factorial(n);
    }
}