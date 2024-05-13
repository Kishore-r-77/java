package java_dsa;

import java.util.ArrayList;
import java.util.List;

public class DsaPractice {

	public static void main(String[] args) {
		// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
		// Output: 6

		int[] nums = {
				-2, 1, -3, 4, -1, 2, 1, -5, 4
		};

		System.out.println(maxSubArray(nums));

	}

	static public int maxSubArray(int[] nums) {
		int currentSum = 0;
		int maxSum = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (currentSum + nums[i] > nums[i]) {
				currentSum = currentSum + nums[i];
			} else {
				currentSum = nums[i];
			}

			if (maxSum < currentSum) {
				maxSum = currentSum;
			}
		}
		return maxSum;
	}

}
