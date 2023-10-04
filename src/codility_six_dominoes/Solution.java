package codility_six_dominoes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] dominoes = {4, 3, 3, 4, 1, 2, 3, 6, 5, 4, 5};
        int occurrence[] = new int[12];

        for (int i = 0; i < dominoes.length; i++){
            boolean visited[] = new boolean[12];
            Arrays.fill(visited, false);
            int counter = 0;
            if (visited[i] == true) {
                continue;
            }
            for (int j = i+1; j < dominoes.length; j++) {
                int k = 0;
                if (dominoes[i] == dominoes[j]) {
                    visited[j] = true;
                    occurrence[k] = dominoes[i];
                    occurrence[k+1] = counter++;
                }
                k = k+2;
            }
            System.out.println(occurrence);
        }
//        for (int i = 0; i < occurrence.length; i++){
//            boolean visited[] = new boolean[6];
//            Arrays.fill(visited, false);
//            int counter = 0;
//            if (visited[i] == true) {
//                continue;
//            }
//            for (int j = i+1; j < dominoes.length; j++) {
//                if (occurrence[i] == occurrence[j]){
//                    visited[j] = true;
//                    counter++;
//                }
//            }
//        }

    }
}

