package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {
		// Input: nums = [2,5,1,3,4,7], n = 3
		// Output: [2,3,5,4,1,7]

		int[] nums = { 2, 5, 1, 3, 4, 7 };
		System.out.println(Arrays.toString(shuffleArray(nums, 3)));
	}

	static int[] shuffleArray(int[] nums, int n) {
		int[] result = new int[nums.length];
		for (int i = 0; i < n; i++) {
			result[2 * i] = nums[i]; // Elements from the first half
			result[2 * i + 1] = nums[i + n]; // Elements from the second half
		}
		return result;
	}

}
