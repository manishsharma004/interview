package amazon.utils;

public class Printer {
    public static void printArray(int[] array) {
        printArray(array, 0, array.length);
    }
    public static void printArray(int[] array, int start, int end) {
        end = end <= array.length ? end : array.length;
        // System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.printf("%3d", array[i]);
            if (i != end-1) {
                System.out.print("   ");
            }
        }
        // System.out.println("]");
        System.out.println();
    }
    public static <T> void printArray(T[] array) {
        printArray(array, 0, array.length);
    }
    public static <T> void printArray(T[] array, int start, int end) {
        end = end <= array.length ? end : array.length;
        System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.print(array[i]);
            if (i != end-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}