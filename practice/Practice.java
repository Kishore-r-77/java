package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 704

        // Input: nums = [-1,0,3,5,9,12], target = 9
        // Output: 4
        // Explanation: 9 exists in nums and its index is 4

        int[] nums = { -1, 0, 3, 5, 9, 12 };

        System.out.println(search(nums, 9, 0, nums.length - 1));

    }

    static public int search(int[] nums, int target, int start, int end) {

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return search(nums, target, mid + 1, end);
        } else if (nums[mid] > target) {
            return search(nums, target, start, mid - 1);
        }

        return -1;

    }

}
