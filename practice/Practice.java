package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 744

        // Input: letters = ["c","f","j"], target = "a"
        // Output: "c"
        // Explanation: The smallest character that is lexicographically greater than
        // 'a' in letters is 'c'.

        char[] letters = { 'c', 'f', 'j' };

        System.out.println(nextGreatestLetter(letters, 'd'));
    }

    static public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return letters[start % letters.length];

    }

}
