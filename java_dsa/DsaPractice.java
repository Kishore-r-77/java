package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {
		int[][] nums = {
				{ 1, 5 },
				{ 7, 3 },
				{ 3, 5 }
		};
		System.out.println(maxWealth(nums));

	}

	public static int maxWealth(int[][] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				if (total < sum) {
					total = sum;
				}
			}
		}
		return total;
	}

}
