package codility_longest_password;

public class RegexSolution {
    public static int longestPassword(String password) {
        String[] words = password.replaceAll("\\s+", " ").split(" ");
        int maxLength = -1;
        for (String word : words) {
            if (word.matches("^[0-9a-zA-Z]*$") &&
                    word.replaceAll("[0-9]+", "").length() % 2 == 0 &&
                    word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1) {
                maxLength = Math.max(maxLength, word.length());
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String testCase = "password123 abcd132 apass2";
        String testCase2 = "test 5 a0A pass007 ?xy1";
        System.out.println("mencoba = " + longestPassword(testCase) + " mencoba 2 = " +longestPassword(testCase2));
    }
}
