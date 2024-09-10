package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));

    }

    static public boolean checkIfPangram(String sentence) {

        char[] alphabets = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) ('a' + i);
        }
        for (char c : alphabets) {
            if (!sentence.contains(c + "")) {
                return false;
            }
        }

        return true;
    }

}
