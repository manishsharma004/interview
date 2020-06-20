public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] tests = new int[]{7, 6};
    }

    private static int[] solve(int N) {
        int[] solution = new int[2];

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