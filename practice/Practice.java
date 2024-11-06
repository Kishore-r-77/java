package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1608

        // Input: nums = [3,5]
        // Output: 2
        // Explanation: There are 2 values (3 and 5) that are greater than or equal to
        // 2.

        int[] nums = { 3, 5 };
        System.out.println(specialArray(nums));

    }

    static public int specialArray(int[] nums) {

        for (int i = 1; i < 1001; i++) {
            int count = 0;

            for (int j : nums) {
                if (j >= i) {
                    count++;
                }

            }
            if (count == i) {
                return count;
            }
        }

        return -1;
    }

}
