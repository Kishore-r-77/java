package java_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DsaPractice {

	public static void main(String[] args) {
		// Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
		// Output: [15]
		// Explanation: 15 is the only lucky number since it is the minimum in its row
		// and the maximum in its column.

		int[][] nums = {
				{ 3, 7, 8 },
				{ 9, 11, 13 },
				{ 15, 16, 17 }
		};
		System.out.println(luckyNumbers(nums));

	}

	static public List<Integer> luckyNumbers(int[][] matrix) {

		List<Integer> output = new ArrayList<>();
		int minRow = 0;
		int maxCol = 0;
		for (int i = 0; i < matrix.length; i++) {
			int index = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (minRow > matrix[i][j]) {
					minRow = matrix[i][j];
					index = i;
				}
				if (maxCol < matrix[j][i]) {
					maxCol = matrix[j][index];

				}
			}
		}

		output.add(maxCol);
		return output;
	}

}
