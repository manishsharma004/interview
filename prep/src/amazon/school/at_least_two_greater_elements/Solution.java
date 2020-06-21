package amazon.school.at_least_two_greater_elements;

import amazon.utils.ConsoleInput;
import amazon.utils.Printer;
import java.util.Arrays;

class Solver {
    private int[] array;

    Solver(int[] array) {
        this.array = array;
    }
    public void solveWithSorting() {
        Printer.printArray(array);
        Arrays.sort(array);
        Printer.printArray(array, 0, array.length-2);
    }
    public void solve() {
        System.out.print("Input array = ");
        Printer.printArray(array);
        int secondLargest = findSecondLargest();

        System.out.println("Second Largest = " + secondLargest);
        for(int i=0; i<array.length; i++) {
            if (array[i] < secondLargest) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    private int findSecondLargest() {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
            else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();
        
        for(int t=0; t<T; t++) {
            int N = ConsoleInput.nextInt();
            int[] numbers = new int[N];
            for(int i=0; i<N; i++) {
                numbers[i] = ConsoleInput.nextInt();
            }
            new Solver(numbers).solve();
        }
    }
}
