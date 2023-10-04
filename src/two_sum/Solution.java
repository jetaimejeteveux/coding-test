package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int complement = target - nums[i];
            if (intMap.containsValue(complement)){
                return new int[] {complement, nums[i]};
            } else {
                intMap.put(complement, nums[i]);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array1 = {5, 7, 3, 9, 10 , 15};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(array1, target)));
    }
}
