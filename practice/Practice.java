package practice;

import java.util.Arrays;
import java.util.List;

class Practice {
	public static void main(String[] args) {
		// Output: [[1,0,0],[0,1,0],[1,1,1]]

		int[][] image = {
				{ 1 },

		};

		System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

	}

	static public int[][] flipAndInvertImage(int[][] image) {
		int start = 0;
		int end = image.length - 1;
		for (int[] innerArray : image) {
			while (start <= end) {
				int temp = innerArray[start];
				innerArray[start++] = innerArray[end] ^ 1;
				innerArray[end--] = temp ^ 1;
			}
		}

		return image;
	}

	static int[] swapArray(int[] arr, int start, int end) {

		int[] result = new int[arr.length];
		if (start <= end) {

			while (start <= end) {
				result[start] = arr[end];
				result[end] = arr[start];
				start++;
				end--;
			}
		}
		return result;
	}
}
