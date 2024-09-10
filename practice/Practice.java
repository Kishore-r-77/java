package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] result = createTargetArray(nums, index);

        // Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        // Output: [0,4,1,3,2]

        System.out.println(Arrays.toString(result));

    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> resultArray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            resultArray.add(index[i], nums[i]);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = resultArray.get(i);
        }
        return result;
    }
}
