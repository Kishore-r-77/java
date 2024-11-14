package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // Input : A = {1, 2, 3, 4, 5}
        // Output : [48]
        // [20, 28]
        // [8, 12, 16]
        // [3, 5, 7, 9]
        // [1, 2, 3, 4, 5]

        int[] nums = { 1, 2, 3, 4, 5 };
        sumOfTriangle(nums);

    }

    static public void sumOfTriangle(int[] nums) {

        int[] result = new int[nums.length - 1];
        if (result.length < 1) {
            return;
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i] + nums[i + 1];
        }

        System.out.println(Arrays.toString(result));

        sumOfTriangle(result);

    }

}
