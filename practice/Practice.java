package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };

		insertionSort(nums);
		System.out.println(Arrays.toString(nums));

	}

	static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}

	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
