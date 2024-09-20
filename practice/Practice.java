package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1967
        // Input: patterns = ["a","abc","bc","d"], word = "abc"
        // Output: 3
        // Explanation:
        // - "a" appears as a substring in "abc".
        // - "abc" appears as a substring in "abc".
        // - "bc" appears as a substring in "abc".
        // - "d" does not appear as a substring in "abc".
        // 3 of the strings in patterns appear as a substring in word.

        String[] patterns = { "a", "abc", "bc", "d" };
        String word = "abc";

        System.out.println(numOfStrings(patterns, word));

    }

    static public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String items : patterns) {
            if (word.contains(items)) {
                count++;
            }
        }

        return count;
    }

}
