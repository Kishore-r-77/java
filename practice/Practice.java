package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1668

        // Input: sequence = "ababc", word = "ab"
        // Output: 2
        // Explanation: "abab" is a substring in "ababc".

        String sequence = "ababc";
        String word = "ab";

        System.out.println(maxRepeating(sequence, word));

    }

    static public int maxRepeating(String sequence, String word) {
        int count = 0;

        StringBuilder sb = new StringBuilder();

        while (sequence.contains(sb.append(word))) {
            count++;
        }

        return count;
    }
}
