package amazon.utils;

public class Printer {
    public static void printArray(int[] array) {
        printArray(array, 0, array.length, ",", true);
    }
    public static void printArray(int[] array, int start, int end, String separator, boolean brackets) {
        end = end <= array.length ? end : array.length;
        if (brackets) System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.printf("%3d", array[i]);
            if (i != end-1) {
                System.out.print(separator + "  ");
            }
        }
        if (brackets) System.out.print("]");

        System.out.println();
    }
    public static <T> void printArray(T[] array) {
        printArray(array, ",", true);
    }
    public static <T> void printArray(T[] array, String separator, boolean brackets) {
        printArray(array, 0, array.length, separator, brackets);
    }
    public static <T> void printArray(T[] array, int start, int end, String separator, boolean brackets) {
        end = end <= array.length ? end : array.length;
        String separatorString = separator + " ";
        if (brackets) {
            System.out.print("[");
        }
        for (int i = start; i < end; i++) {
            System.out.print(array[i]);
            if (i != end-1) {
                System.out.print(separatorString);
            }
        }
        if (brackets) {
            System.out.print("]");
        }
        System.out.println();
    }
}