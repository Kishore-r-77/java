package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1768

        // Input: word1 = "abc", word2 = "pqr"
        // Output: "apbqcr"

        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));

    }

    static public String mergeAlternately(String word1, String word2) {

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        List<Character> resultArray = new ArrayList<>();

        int i = 0, j = 0;

        while (i < word1Array.length && j < word2Array.length) {

            resultArray.add(word1Array[i++]);
            resultArray.add(word2Array[j++]);
        }

        while (i < word1Array.length) {
            resultArray.add(word1Array[i++]);
        }
        while (j < word2Array.length) {
            resultArray.add(word2Array[j++]);
        }
        StringBuilder sb = new StringBuilder();

        for (char c : resultArray) {
            sb.append(c);
        }

        return sb.toString();

    }
}
