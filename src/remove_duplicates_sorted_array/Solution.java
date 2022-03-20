package remove_duplicates_sorted_array;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        
        for (int i = 0;i < nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                nums[index++] = nums[i + 1];
            }
            System.out.println(nums[i]);
        }
        
        System.out.println(index);
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6};
        removeDuplicates(nums);
    }
}
