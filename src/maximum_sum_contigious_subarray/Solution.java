package maximum_sum_contigious_subarray;

public class Solution {
    // public int maxSubArraySumSalah(int[] arr) {
    //     //kadane's algorithm
    //     int size = arr.length;
    //     int start;
    //     int end;
     
    //     int maxSoFar = arr[0], maxEndingHere = arr[0];
     
    //     for (int i = 0; i < size; i++) {
    //         if (arr[i] > maxEndingHere + arr[i]) {
    //             start = i;
    //             maxEndingHere = arr[i];
    //         } else
    //             maxEndingHere = maxEndingHere + arr[i];
     
    //         if (maxSoFar < maxEndingHere) {
    //             maxSoFar = maxEndingHere;
    //             end = i;
    //         }
    //     }
    //     return maxSoFar;
    // }
    public int maxSubArraySum(int[] arr){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}

