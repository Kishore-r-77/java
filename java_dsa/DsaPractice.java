package java_dsa;

import java.util.HashMap;
import java.util.Map;

public class DsaPractice {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 1, 3 };
		System.out.println(goodPairs(nums));
	}

	static int goodPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int num : nums) {
			if (map.containsKey(num)) {
				count += map.get(num);
			}
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		return count;
	}

}
