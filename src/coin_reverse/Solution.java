package coin_reverse;

class Solution {
    public static int solution(int[] A) {
        int sol = 0;
        for (int i = 0; i < A.length-1; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " +i);
            if (A[i] == A[i+1]){
                sol += 1;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1};
        System.out.println(solution(array));

    }
}
