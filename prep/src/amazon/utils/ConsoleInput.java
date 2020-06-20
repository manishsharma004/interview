package amazon.utils;

import java.util.Scanner;

public class ConsoleInput {
    private static Scanner scanner = new Scanner(System.in);

    private ConsoleInput() {}

    public static int nextInt() {
        return scanner.nextInt();
    }

    public static float nextFloat() {
        return scanner.nextFloat();
    }

    public static double nextDouble() {
        return scanner.nextDouble();
    }

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static long nextLong() {
        return scanner.nextLong();
    }

    public static short nextShort() {
        return scanner.nextShort();
    }
}
