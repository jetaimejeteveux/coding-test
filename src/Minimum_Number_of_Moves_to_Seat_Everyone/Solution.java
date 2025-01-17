package Minimum_Number_of_Moves_to_Seat_Everyone;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += Math.abs(seats[i]-students[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(solution.minMovesToSeat(seats, students));
    }
}