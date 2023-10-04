package aesthetic_tree;

public class solution {
    public static int solutionA(int[] A) {
        int sol = 0;
        for (int i = 0; i < A.length - 2; i+=2){
            if ( !(A[i] - A[i+1] > 0 && A[i+1] - A[i+2] < 0) && !(A[i] - A[i+1] < 0 && A[i+1] - A[i+2] > 0)){
                sol += 1;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] A = {3, 4, 5, 3, 7};
        System.out.println("sol = "+solutionA(A));
    }
}
