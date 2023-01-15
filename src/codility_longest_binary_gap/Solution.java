package codility_longest_binary_gap;

import java.util.List;

public class Solution {
    public static int solution(int N) {
        int longestGap = 0;
        int tempGapCount = 0;
        // if (N == 1){
        //     return 0;
        // }
        //10000010001001
        String binaryString = Integer.toBinaryString(N);
        System.out.println("binary string = " + binaryString);
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '0'){
                System.out.println("index saat ini = " + i + "string saat ini = " + binaryString.charAt(i));
                tempGapCount++;
                System.out.println("nilai counter = " + tempGapCount);
            } else if(binaryString.charAt(i) == '1'){
                longestGap = Math.max(tempGapCount, longestGap);
                System.out.println("nilai longest gap = " + longestGap);
                tempGapCount=0;
            }
        }
        return longestGap;
    }

    public static void main(String[] args) {
        System.out.println("mencoba pertama = " + solution(1610612737));
    }
}
