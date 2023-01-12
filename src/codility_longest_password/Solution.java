package codility_longest_password;

public class Solution {
    public static int solution(String s){
        //contains only alphanumerical number a-z,A-Z,0-9
        //even numbers of letters -> total % 2 == 0
        //odd numbers of digits -> total % 2 == 1
        //return the longest word that fulfill the criteria

        int longestPassword = -1;
        String[] arrString = s.split(" ");
        for (int i = 0; i < arrString.length; i++){
            if (checkWords(arrString[i])){
                longestPassword = Math.max(longestPassword, arrString[i].length());
            }
        }
        return longestPassword;
    }
    public static boolean checkWords(String s){
        int digitCount = 0;
        int letterCount = 0;
        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            if(Character.isDigit(currChar)){
                digitCount++;
            } else if (Character.isAlphabetic(currChar)){
                letterCount++;
            }
        }
        return (digitCount % 2 == 1 && letterCount % 2 == 0);
    }

    public static void main(String[] args) {
        String testCase = "password123 abcd132 apass2";
        System.out.println(solution("mencoba = " + testCase));
    }
}
