package amazon.math_utils;

public class Gcd {
    public static int calculate(int a, int b, int ...rest) {
        int gcd = calculate(a, b);

        for(int i=0; i<rest.length; i++) {
            gcd = calculate(gcd, rest[i]);
        }

        return gcd;
    }

    public static int calculate(int a, int b) {
        int min = Math.min(a, b), max = Math.max(a, b);
        
        if (b == 0) return a;

        return calculate(min, max%min);
    }
}