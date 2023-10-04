package codility_2023challenge_task1;

class Solution {
    //You are given an integer N and a string "CODILITY" in which all letters are initially covered.
    //DIving N evenly by 2,3, or 5 uncovers the first letter from the left that is still covered.
    public static String solution(int N) {
        String sol = "";
        String full = "CODILITY";
        int k = 2;
        int index = 0;
        while (N > 1) {
            if (k == 7) {
                break;
            }
            if (N % k == 0) {
                N = N / k;

                index++;

            } else {
                k++;
            }
        }
        for (int j = 0; j < index;j++) {
            sol = sol + full.charAt(j);
            if (j == 7) {
                break;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.println(solution(512));
    }
}
