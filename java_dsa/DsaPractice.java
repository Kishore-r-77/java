package java_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsaPractice {

	public static void main(String[] args) {
		// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
		// Output: [1,2,3,6,9,8,7,4,5]

		int[][] nums = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		System.out.println(spriralOrder(nums));

	}

	static public List<Integer> spriralOrder(int[][] matrix) {

		List<Integer> output = new ArrayList<>();
		int rows = matrix.length;
		int columns = matrix[0].length;
		int top = 0;
		int bottom = rows - 1;
		int left = 0;
		int right = columns - 1;

		while (top <= bottom && left <= right) {
			// left to right
			for (int i = left; i <= right; i++) {
				output.add(matrix[top][i]);
			}
			top++;

		}

		return output;
	}

}
