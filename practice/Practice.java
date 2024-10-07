package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1389

        // Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        // Output: [0,4,1,3,2]
        // Explanation:
        // nums index target
        // 0 0 [0]
        // 1 1 [0,1]
        // 2 2 [0,1,2]
        // 3 2 [0,1,3,2]
        // 4 1 [0,4,1,3,2]

        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];

        List<Integer> resultLists = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {
            resultLists.add(index[i], nums[i]);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = resultLists.get(i);
        }

        return result;
    }

}
