package trapping_rain_water;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;

/**
 *
 * @author firman
 */
public class StackSolution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int mid = height[stack.pop()];
                if (!stack.isEmpty()) {
                    int right = height[i];
                    int left = height[stack.peek()];
                    int h = Math.min(right, left) - mid;
                    int w = i - stack.peek() - 1;
                    res += h * w;
                }
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,0,3,1,0,1,3,2,1};
        StackSolution solution = new StackSolution();
        int ans = solution.trap(arr);
        System.out.println(ans);
    }
}
