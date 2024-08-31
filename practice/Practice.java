package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };

		selection(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selection(int[] arr) {

		for (int i = 0; i < arr.length - i; i++) {

			int lastIndex = arr.length - 1 - i;
			int maxIndex = getMaxIndex(arr, 0, lastIndex);
			swap(arr, maxIndex, lastIndex);

		}

	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int maxIndex = start;

		for (int i = start; i <= end; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}

		return maxIndex;
	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
