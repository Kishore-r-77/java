package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(nums)));

	}

	// output=[1,3,6,10]
	public static int[] runningSum(int[] nums) {
		int[] newArray = new int[nums.length];
		int runningSum = 0;
		for (int i = 0; i < nums.length; i++) {
			runningSum += nums[i];
			newArray[i] = runningSum;
		}
		return newArray;

	}

}
