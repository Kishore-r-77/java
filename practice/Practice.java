package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 125

        // Input: s = "A man, a plan, a canal: Panama"
        // Output: true

        String s = "race a car";

        System.out.println(isPalindrome(s));

    }

    static public boolean isPalindrome(String s) {

        List<Character> characters = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetterOrDigit(charArray[i])) {
                characters.add(charArray[i]);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char c : characters) {
            sb.append(c);
        }

        return checkPalindrome(sb.toString().toLowerCase());

    }

    static boolean checkPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] == charArray[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}
