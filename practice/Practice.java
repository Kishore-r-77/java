package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		// Input: nums = [1,2,3,4]
		// Output: [1,3,6,10]

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(runningSum(nums)));

	}

	static public int[] runningSum(int[] nums) {

		int[] ans = new int[nums.length];

		int temp = 0;

		for (int i = 0; i < ans.length; i++) {
			temp += nums[i];
			ans[i] = temp;
		}

		return ans;

	}

}
