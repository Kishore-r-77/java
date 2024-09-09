package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		// Input: nums = [0,2,1,5,3,4]
		// Output: [0,1,2,4,5,3]

		int[] nums = { 0, 2, 1, 5, 3, 4 };

		System.out.println(Arrays.toString(buildArray(nums)));

	}

	static public int[] buildArray(int[] nums) {

		int[] ans = new int[nums.length];

		for (int i = 0; i < ans.length; i++) {
			ans[i] = nums[nums[i]];
		}

		return ans;
	}

}
