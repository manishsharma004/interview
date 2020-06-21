package amazon.school.reverseastring;

import amazon.utils.ConsoleInput;
import amazon.utils.Swapper;

class Solver {
    public String reverseStringWithRecursion(String sourceString) {
        if (sourceString.length() < 2) {
            return sourceString;
        }

        return reverseStringWithRecursion(sourceString.substring(1)) + sourceString.substring(0, 1);
    }
    
    public String reverseString(String sourceString) {
        char[] string = sourceString.toCharArray();
        
        for(int i=0; i<string.length/2; i++) {
            Swapper.swap(string, i, string.length - 1 - i);
        }

        return new String(string);
    }
}



public class Solution {
    public static void main(String[] args) {
        solve();
    }
    private static void solve() {
        int N = ConsoleInput.nextInt();
        ConsoleInput.nextLine(); // Remove \n from buffer

        while(N-- > 0) {
            String S = ConsoleInput.nextLine();

            System.out.println(new Solver().reverseString(S));
        }
    }
}