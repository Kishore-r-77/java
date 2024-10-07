package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1389

        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true
        // Explanation: sentence contains at least one of every letter of the English
        // alphabet.

        String sentence = "leetcode";

        System.out.println(checkIfPangram(sentence));

    }

    static public boolean checkIfPangram(String sentence) {

        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.contains(i + "")) {
                return false;
            }
        }

        return true;
    }

}
