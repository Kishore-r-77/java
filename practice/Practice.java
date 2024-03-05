package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Practice {
	public static void main(String[] args) {
		// Output: 25

		int[][] mat = {
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },

		};

		System.out.println(diagonalSum(mat));

	}

	static public int diagonalSum(int[][] mat) {
		int n = mat.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += mat[i][i]; // Sum of primary diagonal elements
			sum += mat[i][n - i - 1]; // Sum of secondary diagonal elements
		}

		// If the matrix size is odd, we've counted the middle element twice
		if (n % 2 == 1) {
			sum -= mat[n / 2][n / 2];
		}

		return sum;
	}

}
