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

        int result[] = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < result.length; j++) {
                if (nums[i] > nums[j]) {
                    count += 1;
                }
            }
            result[i] = count;
        }

        return result;

    }

}
