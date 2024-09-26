package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 58

        // Input: s = " fly me to the moon "
        // Output: 4
        // Explanation: The last word is "moon" with length 4.

        String s = " fly me to the moon ";

        System.out.println(lengthOfLastWord(s));

    }

    static public int lengthOfLastWord(String s) {

        s = s.trim();

        String[] wordArray = s.split(" ");

        return wordArray[wordArray.length - 1].length();

    }
}
