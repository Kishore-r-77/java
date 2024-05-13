package practice;

import java.util.HashMap;
import java.util.Map;

class Practice {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 1, 2, 3, 5, 1, 2, 4 };

		System.out.println(recurring(nums));
	}

	static int recurring(int[] nums) {
		Map<Integer, Integer> hashTable = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashTable.containsKey(nums[i])) {
				return nums[i];
			} else {
				hashTable.put(nums[i], i);
			}
		}
		return -1;
	}

}
