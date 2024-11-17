package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 344

        // Example 1:

        // Input: s = ["h","e","l","l","o"]
        // Output: ["o","l","l","e","h"]

        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };

        reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    static public void reverseString(char[] s) {
        recursiveReverse(s, 0, s.length - 1);

    }

    static public void recursiveReverse(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        swap(start, end, s);
        start += 1;
        end -= 1;
        recursiveReverse(s, start, end);
    }

    static void swap(int start, int end, char[] arr) {

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

}
