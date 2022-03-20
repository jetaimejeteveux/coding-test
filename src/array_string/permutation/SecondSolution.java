package array_string.permutation;

public class SecondSolution {

    public static Boolean permutation(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int[] letters = new int[128];

        char[] s1_array = s1.toCharArray();

        for (char c : s1_array){
            letters[c]++;
            System.out.println("c =" + c);
            System.out.println("letters[c] = "+ letters[c]);
        }

        for (int i = 0; i < s2.length(); i++){
            int c = (int) s2.charAt(i);
            System.out.println("for kedua");
            System.out.println(i);
            System.out.println(c);
            System.out.println(letters[c]);
            letters[c]--;
            if (letters[c] < 0){
                System.out.println("if di dalem for");
                System.out.println(letters[c]);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "firman";
        String s2 = "manfir";
        System.out.println(permutation(s1, s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
