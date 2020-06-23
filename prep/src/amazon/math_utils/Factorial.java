package amazon.math_utils;

import java.math.BigInteger;

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
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(new BigInteger("0")))
            return new BigInteger("1");

        BigInteger factorial = new BigInteger(n.toString());
        n = n.subtract(new BigInteger("1"));

        while(n.compareTo(new BigInteger("1")) > 0) {
            factorial = factorial.multiply(n);
            n = n.subtract(new BigInteger("1"));
        }

        return factorial;
    }
}