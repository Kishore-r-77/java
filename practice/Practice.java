package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		// Input: nums = [1,2,1]
		// Output: [1,2,1,1,2,1]

		int[] nums = { 1, 2, 1 };

		System.out.println(Arrays.toString(getConcatenation(nums)));

	}

	static public int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}

		return ans;

	}

}
