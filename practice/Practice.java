package practice;

import java.util.Arrays;

class Practice {

	public static void main(String[] args) {

		int[] nums = { 1, 7, 8, 9, 22 };

		System.out.println(Arrays.toString(twoSum(nums, 17)));

	}

	static int[] twoSum(int[] arr, int target) {
		int[] ans = new int[2];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return ans;
	}
	
}
