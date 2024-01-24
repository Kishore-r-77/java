package java_dsa;

import java.util.ArrayList;
import java.util.List;

public class DsaPractice {
	public static void main(String[] args) {
		// Input: candies = [2,3,5,1,3], extraCandies = 3
		// Output: [true,true,true,false,true]

		int[] candies = { 2, 3, 5, 1, 3 };
		System.out.println(kidsWithCandies(candies, 3));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> resultArray = new ArrayList<>();
		int maxCandies = 0;
		for (int singleCandies : candies) {
			maxCandies = Math.max(maxCandies, singleCandies);

		}

		for (int singleCandies : candies) {
			resultArray.add(singleCandies + extraCandies >= maxCandies);
		}

		return resultArray;
	}

}
