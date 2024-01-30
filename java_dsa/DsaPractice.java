package java_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsaPractice {
	// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
	// Output: [0,4,1,3,2]
	// Explanation:
	// nums index target
	// 0 0 [0]
	// 1 1 [0,1]
	// 2 2 [0,1,2]
	// 3 2 [0,1,3,2]
	// 4 1 [0,4,1,3,2]
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	static int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];

		List<Integer> newArray = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			newArray.add(index[i], nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			target[i] = newArray.get(i);
		}

		return target;
	}

}
