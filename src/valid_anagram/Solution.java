package valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //idenya adalah dengan menghitung frekuensi jumlah karakter di string s
    //lalu dikurangi dengan frekuensi jumlah karakter di string t
    //apabila ada karakter yang jumlahnya tidak 0 maka bukan anagram
    //jika jumlahnya 0 maka anagram
    public static boolean isAnagram(String s, String t){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char x : s.toCharArray()){
            characterIntegerMap.put(x, characterIntegerMap.getOrDefault(x, 0)+1);
        }
        for (char x : t.toCharArray()){
            characterIntegerMap.put(x, characterIntegerMap.getOrDefault(x, 0)+1);
        }
        for (int val : characterIntegerMap.values()){
            if (val == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
