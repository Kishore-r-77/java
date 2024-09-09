package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		// Input: nums = [2,5,1,3,4,7], n = 3
		// Output: [2,3,5,4,1,7]

		int[] nums = {
				2, 5, 1, 3, 4, 7
		};

		System.out.println(Arrays.toString(shuffle(nums, 3)));

	}

	static public int[] shuffle(int[] nums, int n) {
		int[] output = new int[nums.length];

		for (int i = 0; i < n; i++) {
			output[2 * i] = nums[i];
			output[2 * i + 1] = nums[i + n];
		}

		return output;
	}

}
