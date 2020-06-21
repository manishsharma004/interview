package amazon.school.count_type_of_characters;

import amazon.utils.ConsoleInput;


class Solver {
    private char[] input;

    Solver(String input) {
        this.input = input.toCharArray();
    }

    public void printCountTypes() {
        int lowerCaseCount = 0, upperCaseCount = 0, numericCount = 0, specialCharCount = 0;

        for(int i=0; i<input.length; i++) {
            if (isBetween(i, 48, 57)) {
                numericCount++;
            } else if (isBetween(i, 65, 90)) {
                upperCaseCount++;
            } else if (isBetween(i, 97, 122)) {
                lowerCaseCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
        System.out.println(numericCount);
        System.out.println(specialCharCount);
    }

    private boolean isBetween(int index, int start, int end) {
        return input[index] >= start && input[index] <= end;
    }
}

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int T = ConsoleInput.nextInt();
        ConsoleInput.nextLine();
        for(int t=0; t<T; t++) {
            String str = ConsoleInput.nextLine();

            new Solver(str).printCountTypes();
        }
    }
}