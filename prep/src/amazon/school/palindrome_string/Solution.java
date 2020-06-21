package amazon.school.palindrome_string;

import amazon.utils.ConsoleInput;

public class Solution {
    public static void main(String[] args){
        solve();
    }
    private static void solve(){
        int T = ConsoleInput.nextInt();
        for(int t=0; t<T; t++){
            int L = ConsoleInput.nextInt();
            ConsoleInput.nextLine();
            String S = ConsoleInput.nextLine();
            if (new Solver(S).isPalindromeRecursive(S)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

class Solver {
    private String S;

    Solver(String S) {
        this.S = S;
    }

    public boolean isPalindrome() {
        char[] array = S.toCharArray();

        for(int i=0; i<array.length/2-1; i++) {
            if (array[i] != array[array.length-1-i]) {
                return false;
            }
        }

        return true;
    }
    public boolean isPalindromeRecursive(String Sr) {

        if (Sr.length() == 0 || Sr.length() == 1)
            return true;

        if (Sr.charAt(0) != Sr.charAt(Sr.length()-1))
            return false;
        else
            return isPalindromeRecursive(Sr.substring(1, Sr.length()-1));
    }
}