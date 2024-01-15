package practice;

import java.util.Arrays;

class Practice {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 1 };
		selectionSortRecursion(arr, arr.length - 1, 0, 0);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSortRecursion(int[] arr, int r, int c, int max) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			if (arr[c] > arr[max]) {
				selectionSortRecursion(arr, r, c + 1, c);
			} else {
				selectionSortRecursion(arr, r, c + 1, max);
			}
		} else {
			int temp = arr[max];
			arr[max] = arr[r - 1];
			arr[r - 1] = temp;
			selectionSortRecursion(arr, r - 1, 0, 0);
		}
	}
}
