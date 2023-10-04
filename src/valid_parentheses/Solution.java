package valid_parentheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s){
        if (s.length() % 2 != 0) return false;

        Stack<Character> bracketStack = new Stack<>();
        for (Character ch : s.toCharArray()){
            //({[)
            if (bracketStack.isEmpty() && (ch == '}' || ch == ']' || ch == ')')){
              return false;
            }
            else if (!bracketStack.isEmpty()){
                if (bracketStack.peek() == '(' && ch == ')'){
                    bracketStack.pop();
                } else if (bracketStack.peek() == '[' && ch == ']'){
                    bracketStack.pop();
                } else if (bracketStack.peek() == '{' && ch == '}'){
                    bracketStack.pop();
                } else {
                    bracketStack.push(ch);
                }
            } else {
                bracketStack.push(ch);
            }
        }
        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "([{}])";
        String s2 = ")]}";
        String s3 = "[{(])}";
        String s4 = "({[)";
//        System.out.println(isValid(s1));
//        System.out.println(isValid(s2));
//        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }
}
