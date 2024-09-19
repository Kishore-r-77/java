package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1662
        // Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        // Output: true

        String[] word1 = { "abc", "d", "defg" };
        String[] word2 = { "abcddefg" };

        System.out.println(arrayStringsAreEqual(word1, word2));

    }

    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);

        }

        return sb1.toString().equals(sb2.toString());
    }

}
