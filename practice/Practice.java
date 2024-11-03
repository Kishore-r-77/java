package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Practice {
    public static void main(String[] args) {

        // leetcode 349

        // Input: nums1 = [1,2,2,1], nums2 = [2,2]
        // Output: [2]

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (Integer num : nums1) {
            numSet1.add(num);
        }
        for (Integer num : nums2) {
            if (numSet1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];

        int index = 0;

        for (int i : resultSet) {
            result[index++] = i;
        }

        return result;

    }

}
