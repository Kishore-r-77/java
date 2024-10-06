package practice;

import java.util.HashMap;
import java.util.Map;

class Practice {
    public static void main(String[] args) {

        // leetcode 1512

        // Input: nums = [1,2,3,1,1,3]
        // Output: 4
        // Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

        int[] nums = { 1, 2, 3, 1, 1, 3 };

        System.out.println(numIdenticalPairs(nums));

    }

    static public int numIdenticalPairs(int[] nums) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])) {
                count += 1;
            }
        }

        return count;
    }

}
