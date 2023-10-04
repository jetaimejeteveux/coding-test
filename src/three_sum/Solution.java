package three_sum;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum (int[] nums){
        Set<List<Integer>> sol = new HashSet<List<Integer>>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = 0;
                int right = nums.length-1;
                int target = -nums[i];
                while(left < right){
                    if (nums[left] + nums[right] == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        sol.add(temp);
                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    } else if(nums[left] + nums[right] < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(sol);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, -1, 2, 0, -2, 3, 0, -3, 4, 0, -4};
        System.out.println(threeSum(arr1));
    }
}
