package practice;

import java.util.HashMap;
import java.util.Map;

class Practice {
    public static void main(String[] args) {

        // leetcode 13

        // Input: s = "III"
        // Output: 3
        // Explanation: III = 3.

        // Symbol Value
        // I 1
        // V 5
        // X 10
        // L 50
        // C 100
        // D 500
        // M 1000

        String s = "III";

        System.out.println(romanToInt(s));

    }

    static public int romanToInt(String s) {

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;

    }
}
