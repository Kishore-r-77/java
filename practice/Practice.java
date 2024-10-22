package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 26

        // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        // Explanation: Your function should return k = 5, with the first five elements
        // of nums being 0, 1, 2, 3, and 4 respectively.
        // It does not matter what you leave beyond the returned k (hence they are
        // underscores).

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println(removeDuplicates(nums));

    }

    static public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;

    }

}
