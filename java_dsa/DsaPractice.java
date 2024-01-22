package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		System.out.println(Arrays.toString(buildArray(nums)));
	}

	static public int[] buildArray(int[] nums) {

		// int[] result = new int[nums.length];
		// for (int i = 0; i < nums.length; i++) {
		// result[i] = nums[nums[i]];
		// }
		// return result;

		int constant = nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[i] += nums[nums[i]] % constant * constant;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] /= constant;
		}
		return nums;
	}

}
