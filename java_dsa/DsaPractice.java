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

	public static int maxWealth(int[][] accounts) {
		int maxWealth = 0;
		for (int[] customerAccounts : accounts) {
			int customerWealth = Arrays.stream(customerAccounts).sum();
			maxWealth = Math.max(maxWealth, customerWealth);
		}

		return maxWealth;
	}

}
