package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		int[] nums = { 5, 4, 3, 2, 1, 0 };
		cycleSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void cycleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int correctIndex = arr[i] - 1;
			if (arr[correctIndex] != arr[i]) {
				swap(arr, i, correctIndex);
			}
		}
	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
