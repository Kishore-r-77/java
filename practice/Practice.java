package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		// Input: accounts = [[1,2,3],[3,2,1]]
		// Output: 6

		int[][] nums = {
				{ 1, 2, 3 },
				{ 3, 2, 1 },
		};

		System.out.println(maximumWealth(nums));

	}

	static public int maximumWealth(int[][] accounts) {

		int max = 0;

		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int j = 0; j < accounts[0].length; j++) {
				sum += accounts[i][j];
				if (sum > max) {
					max = sum;
				}
			}

		}

		return max;
	}

}
