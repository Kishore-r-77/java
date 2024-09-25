package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 2000

        // Input: word = "abcdefd", ch = "d"
        // Output: "dcbaefd"

        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));

    }

    static public String reversePrefix(String word, char ch) {

        char[] wordArray = word.toCharArray();

        int end = word.indexOf(ch);
        if (end == -1) {
            return word;
        }
        swap(0, word.indexOf(ch), wordArray);

        StringBuilder sb = new StringBuilder();
        for (char c : wordArray) {
            sb.append(c);
        }
        return sb.toString();

    }

    static void swap(int start, int end, char[] arr) {

        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
