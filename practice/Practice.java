package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 66

        // Input: digits = [1,2,3]
        // Output: [1,2,4]
        // Explanation: The array represents the integer 123.
        // Incrementing by one gives 123 + 1 = 124.
        // Thus, the result should be [1,2,4].

        int[] digits = { 9, 9, 9 };

        System.out.println(Arrays.toString(plusOne(digits)));

    }

    static public int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArray = new int[n + 1];
        newArray[0] = 1;
        return newArray;

    }

}
