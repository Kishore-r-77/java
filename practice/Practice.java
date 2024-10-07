package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 1365

        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]
        // Explanation:
        // For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        // For nums[1]=1 does not exist any smaller number than it.
        // For nums[2]=2 there exist one smaller number than it (1).
        // For nums[3]=2 there exist one smaller number than it (1).
        // For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

        int[] nums = { 8, 1, 2, 2, 3 };

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }

    static public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101]; // Step 1: frequency array for range [0, 100]

        // Step 1: Count the frequency of each number in nums
        for (int num : nums) {
            count[num]++;
        }

        // Step 2: Compute cumulative counts for numbers <= current number
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Prepare the result array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0; // No number is smaller than 0
            } else {
                result[i] = count[nums[i] - 1]; // How many numbers are smaller than nums[i]
            }
        }

        return result;

    }

}
