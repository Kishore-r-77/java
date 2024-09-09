package practice;

import java.util.HashMap;
import java.util.Map;

class Practice {
	public static void main(String[] args) {

		// Input: nums = [1,2,3,1,1,3]
		// Output: 4

		int[] nums = { 1, 2, 3, 1, 1, 3 };

		System.out.println(numIdenticalPairs(nums));

	}

	static public int numIdenticalPairs(int[] nums) {
		int output = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				output += map.get(nums[i]);
			}
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		return output;
	}

}
