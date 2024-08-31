package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean isSwap = false;
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
					isSwap = true;
				}
			}
			if (!isSwap) {
				break;
			}

		}
	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
