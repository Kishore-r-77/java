package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 6, 8, 7, 3, 2, 9 };

		mergeSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));

	}

	static void mergeSort(int[] arr, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = start + (end - start) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		merge(arr, start, mid, end);

	}

	static void merge(int[] arr, int start, int mid, int end) {
		int joined[] = new int[end - start];

		int i = start, j = mid, k = 0;

		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				joined[k++] = arr[i++];
			} else {
				joined[k++] = arr[j++];
			}
		}
		while (i < mid) {
			joined[k++] = arr[i++];
		}
		while (j < end) {
			joined[k++] = arr[j++];
		}

		for (int index = 0; index < joined.length; index++) {
			arr[start + index] = joined[index];
		}

	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
