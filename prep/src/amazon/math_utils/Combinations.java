package amazon.math_utils;

public class Combinations {
    public static int calculateCombinations(int n, int r) {
        if (n == 0) {
            return 0;
        }

        return factorial(n) / factorial(n-r) / factorial(r);
    }

    private static int factorial(int n) {
        return Factorial.factorial(n);
    }
}