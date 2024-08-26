package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		int[] nums = { 5, 4, 3, 2, 1, 0 };
		quicksort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	static void quicksort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;
		int pivot = arr[mid];
		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		quicksort(arr, low, end);
		quicksort(arr, start, high);
	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
