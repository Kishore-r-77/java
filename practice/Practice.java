package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
	public static void main(String[] args) {

		// Input: candies = [2,3,5,1,3], extraCandies = 3
		// Output: [true,true,true,false,true]

		int[] candies = { 2, 3, 5, 1, 3 };

		System.out.println(kidsWithCandies(candies, 3));

	}

	static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> isMaxCandies = new ArrayList<>();

		int maxCandies = 0;
		for (int i = 0; i < candies.length; i++) {
			if (maxCandies < candies[i]) {
				maxCandies = candies[i];
			}
		}

		for (int i = 0; i < candies.length; i++) {
			if (extraCandies + candies[i] >= maxCandies) {
				isMaxCandies.add(true);
			} else {
				isMaxCandies.add(false);
			}
		}

		return isMaxCandies;
	}

}
