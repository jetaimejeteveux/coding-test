package two_sum_second;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSumSecond (int[] nums, int target){
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(intMap.containsKey(complement)){
                return new int[] {i+1, intMap.get(complement)+1};
            }
            intMap.put(nums[i], i);
        }
        return new int[]{};
    }
    public static int[] twoSumSecondUsingTwoPointer (int[] numbers, int target){
        int left = 0, right = numbers.length-1;
        while(left < right) {
            int angkaKiri = numbers[left];
            int angkaKanan = numbers[right];
            if (angkaKiri + angkaKanan == target) {
                return new int[]{left + 1, right + 1};
            }
            if (angkaKiri + angkaKanan < target){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 25, 75};
        System.out.println(Arrays.toString(twoSumSecondUsingTwoPointer(arr1, 100)));
    }
}
