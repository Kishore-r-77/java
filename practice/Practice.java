package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Practice {
	public static void main(String[] args) {

		// Input: nums = [8,1,2,2,3]
		// Output: [4,0,1,1,3]

		int[] nums = { 8, 1, 2, 2, 3 };

		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

	}

	static public int[] smallerNumbersThanCurrent(int[] nums) {

		int result[] = new int[nums.length];

		for (int i = 0; i < result.length; i++) {
			int count = 0;
			for (int j = 0; j < result.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
			result[i] = count;
		}

		return result;
	}

}
