package java_dsa;

import java.util.Arrays;

public class DsaPractice {

	public static void main(String[] args) {
		// Input: nums = [0,2,1,5,3,4]
		// Output: [0,1,2,4,5,3]

		int[] nums = {
				0, 2, 1, 5, 3, 4
		};

		System.out.println(Arrays.toString(buildArray(nums)));

	}

	static public int[] buildArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i] += nums[nums[i]] % nums.length * nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] /= nums.length;
		}

		return nums;
	}

}
