package Count_the_Number_of_Consistent_Strings;

import java.util.HashMap;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer> mp = new HashMap();
        int count = words.length;
        for (int i = 0; i < allowed.length(); i++)
            mp.put(allowed.charAt(i), 1);

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (mp.get(words[i].charAt(j)) == null) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        Solution solution = new Solution();
        System.out.println(solution.countConsistentStrings(allowed, words));
    }
}
