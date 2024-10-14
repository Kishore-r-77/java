package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1295

        // Input: nums = [12,345,2,6,7896]
        // Output: 2
        // Explanation:
        // 12 contains 2 digits (even number of digits).
        // 345 contains 3 digits (odd number of digits).
        // 2 contains 1 digit (odd number of digits).
        // 6 contains 1 digit (odd number of digits).
        // 7896 contains 4 digits (even number of digits).
        // Therefore only 12 and 7896 contain an even number of digits.

        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumbers(nums));

    }

    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = checkDigitsCount(nums[i]);
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int checkDigitsCount(int digit) {
        int count = 0;

        while (digit != 0) {
            digit /= 10;
            count++;
        }
        return count;
    }

}
