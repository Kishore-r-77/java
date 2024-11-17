package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // Input: arr = {1, 4, 3, -5, -4, 8, 6};
        // Output: min = -5, max = 8

        int[] nums = { 1, 4, 3, -5, -4, 8, 6 };

        System.out.println(Arrays.toString(minMaxRecursive(nums, 0, nums.length - 1)));

    }

    static public int[] minMaxRecursive(int[] nums, int start, int end) {

        if (start == end) {
            return new int[] { nums[start], nums[end] };
        }

        if (end - start == 1) {
            return new int[] { minValue(nums[start], nums[end]), maxValue(nums[start], nums[end]) };
        }

        int mid = start + (end - start) / 2;

        int[] leftArray = minMaxRecursive(nums, start, mid);
        int[] rightArray = minMaxRecursive(nums, mid + 1, end);

        int min = minValue(leftArray[0], rightArray[0]);
        int max = maxValue(leftArray[1], rightArray[1]);

        return new int[] { min, max };

    }

    static int maxValue(int val1, int val2) {
        return val1 > val2 ? val1 : val2;
    }

    static int minValue(int val1, int val2) {
        return val1 < val2 ? val1 : val2;
    }

}
