package java_dsa;

import java.util.Arrays;

public class DsaPractice {

	public static void main(String[] args) {
		// Input: n = 5
		// Output: [-7,-1,1,3,4]

		System.out.println(Arrays.toString(sumZero(5)));

	}

	static public int[] sumZero(int n) {
		int[] result = new int[n];
		for (int i = 1; i < n; i++) {
			result[i] = i * 2 - n + 1;
		}

		return result;
	}

}
