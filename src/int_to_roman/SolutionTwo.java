package int_to_roman;

import java.util.LinkedHashMap;
import java.util.Map;

class SolutionTwo {
    public String intToRoman(int num) {
        // Use LinkedHashMap to maintain insertion order
        Map<Integer, String> intToRomanMap = new LinkedHashMap<>();
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(900, "CM");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(400, "CD");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(90, "XC");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(40, "XL");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");

        StringBuilder roman = new StringBuilder();

        for (Map.Entry<Integer, String> entry : intToRomanMap.entrySet()) {
            while (num >= entry.getKey()) {
                roman.append(entry.getValue());
                num -= entry.getKey();
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        SolutionTwo solution = new SolutionTwo();
        System.out.println(solution.intToRoman(910));
    }
}
