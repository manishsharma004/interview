package amazon.math_utils;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        int factorial = n;

        while(--n > 1) {
            factorial *= n;
        }

        return factorial;
    }
}