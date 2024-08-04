package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };

		selectionSort(nums);
		System.out.println(Arrays.toString(nums));

	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			int maxIndex = getMaxIndex(arr, 0, arr.length - i - 1);
			swap(arr, maxIndex, arr.length - i - 1);
		}
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int maxIndex = start;
		for (int i = 0; i <= end; i++) {
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
