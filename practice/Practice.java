package practice;

import java.util.HashMap;

class Practice {
    public static void main(String[] args) {

        // leetcode 1

        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        int[] nums = { 2, 7, 11, 15 };

        System.out.println(twoSum(nums, 9));

    }

    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

}
