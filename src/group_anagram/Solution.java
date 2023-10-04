package group_anagram;

import java.util.*;

public class Solution {
    //idenya adalah dengan mengumpulkan kata yang beranagram dengan sesamanya, karena
    // anagram adalah sebuah kata yang memiliki jumlah huruf yang sama hanya berbeda urutannya

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> mapString = new HashMap<>();
        for (String str : strs) {
            char[] arrCh = str.toCharArray();
            Arrays.sort(arrCh);
            String keyString = String.valueOf(arrCh);
            if (!mapString.containsKey(keyString)) {
                mapString.put(keyString, new ArrayList<>());
            }
            mapString.get(keyString).add(str);
        }
        return new ArrayList<>(mapString.values());
    }

    public static void main(String[] args) {
        String[] arr1 = {"eat", "dog", "ate", "god", "tae"};
        System.out.println(groupAnagrams(arr1));
    }
}
