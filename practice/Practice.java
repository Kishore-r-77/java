package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 1929

        // Input: nums = [1,2,1]
        // Output: [1,2,1,1,2,1]
        // Explanation: The array ans is formed as follows:
        // - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        // - ans = [1,2,1,1,2,1]

        int[] nums = { 1, 2, 1 };

        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    static public int[] getConcatenation(int[] nums) {
        int result[] = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        }

        return result;

    }

}
