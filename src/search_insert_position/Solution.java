package search_insert_position;
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for(i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
            if (target == nums[i]){
                return i;
            } 
            else if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7, 8};
        int target = 5;
        System.out.println(searchInsert(nums, target)); 
    }
}
