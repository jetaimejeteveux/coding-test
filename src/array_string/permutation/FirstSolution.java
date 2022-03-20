package array_string.permutation;

//diberikan dua string, buatlah method untuk menentukan apakah 2 strings saling permutation satu sama lain

public class FirstSolution {



    public static String sortChar(String s) {
        char[] charArray = s.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);

    }

    public static boolean firstSolution(String pertama, String kedua) {
        if (pertama.length() != kedua.length()) {
            return false;
        }
        return sortChar(pertama).equals(sortChar(kedua));
    }

    public static void main(String[] args) {
        String s1 = "firman";
        String s2 = "manfir";
        System.out.println(firstSolution(s1, s2));
    }
}


