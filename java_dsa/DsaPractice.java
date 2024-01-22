package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 1 };
		System.out.println(Arrays.toString(concatenationOfArray(nums)));
	}

	public static int[] concatenationOfArray(int[] nums) {
		int[] newArray = new int[nums.length * 2];
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			newArray[i] = nums[i];
			newArray[i + n] = nums[i];
		}
		return newArray;
	}

}
