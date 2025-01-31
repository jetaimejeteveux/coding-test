package reverse_polish_notation;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;
import trapping_rain_water.TwoPointerSolution;

/**
 *
 * @author firman
 */
public class StackSolution {
    public int evaluateReversePolishNotation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] arr = {"1","2","+","3","*","4","-"};
        StackSolution solution = new StackSolution();
        int ans = solution.evaluateReversePolishNotation(arr);
        System.out.println(ans);
    }
}
