public class Solution {
    public static void main(String[] args) {
        int[] tests = new int[]{7, 6};
        for(int i=0; i<tests.length; i++) {
            int[] solution = solve(tests[i]);
            if (solution[0] == -1 && solution[1] == -1) {
                System.out.println(-1);
            } else {
                System.out.println(solution[0] + " " + solution[1]);
            }
        }
    }
    private static int[] solve(int N) {
        int[] solution = new int[]{-1, -1};

        double sqrtN = Math.sqrt(N);
        
        for(int i=1; i<=sqrtN; i++){
            if(N % i == 0){
                int D = N / i;

                if (i <= D && i%2 == D%2) {
                    int A = i + (D - i) / 2;
                    int B = (D - i) / 2;
                    solution[0] = A;
                    solution[1] = B;
                }
            }
        }

        return solution;
    }
}