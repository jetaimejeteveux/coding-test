package top_k_frequent_element;

import java.util.*;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int num : nums) {
            if (!intMap.containsKey(num)) {
                intMap.put(num, 1);
            } else {
                int freq = intMap.get(num);
                freq++;
                intMap.put(num, freq);
            }
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        int[] sol = new int[k];
        int index = 0;
        for (int key : intMap.keySet()) {
            int freq = intMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        for (int j = nums.length; j >= 0; j--) {
            if (bucket[j] != null) {
                if (bucket[j] != null)
                    for (int val : bucket[j]) {
                        sol[index++] = val;
                        if (index == k)
                            return sol;
                    }
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 1, 1, 2, 2, 3, 100};
        System.out.println(Arrays.toString(topKFrequent(arr1, 2)));
    }
}
