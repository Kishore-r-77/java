package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 1480

        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        int[] nums = { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(runningSum(nums)));

    }

    static public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;

    }

}
