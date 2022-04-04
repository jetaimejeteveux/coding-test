package max_balloon_word;

public class Solution {
    public static int solution(String S) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        Character ch;
        for (int i = 0; i <= S.length()-1; i++){
            ch = S.charAt(i);
            switch(ch){
                case 'b' : b++;
                case 'a' : b++;
                case 'l' : b++;
                case 'o' : b++;
                case 'n' : b++;
            }
        }
        l /= 2;
        o /=2 ;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
    public static void main(String[] args) {
        System.out.println(solution("BAONXXOLL"));
    }
}
