package valid_palindrome;

public class Solution {
    //kasurusak
    //katak
    public static boolean isPalindrome (String s){
        char[] ch = s.replaceAll("[-+^]*", " ").replaceAll("\\s", "").toLowerCase().trim().toCharArray();
        char left, right;
        int down = ch.length;

        for (int i = 0; i<ch.length; i++){
            left = ch[i];
            right = ch[--down];
            System.out.println("ini ke " + i + " adalah  " + left);
            System.out.println("ini ke " + i + " adalah  " +right);
            if(left != right){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
