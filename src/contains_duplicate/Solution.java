package contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //idenya adalah dengan mengecek angka di array dengan di hashmap, kalo ngga sama masuk
    // hashmap, begitu ketemu sama langsung muncul true, kalo beda semua false
    // beda semua artinya sampe elemen terakhir langsung false
    public static boolean containDuplicate (int[] nums){
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(!numsMap.containsValue(nums[i])){
                numsMap.put(i, nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(containDuplicate(arr1));
    }
}
