package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 1470

        // Input: nums = [2,5,1,3,4,7], n = 3
        // Output: [2,3,5,4,1,7]
        // Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
        // [2,3,5,4,1,7].

        int[] nums = { 2, 5, 1, 3, 4, 7 };

        System.out.println(Arrays.toString(shuffle(nums, 3)));

    }

    static public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];

        }
        return result;
    }

}
