package java_dsa;

import java.util.Arrays;

public class DsaPractice {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		selectionSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int lastIndex = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, lastIndex);
			swap(arr, maxIndex, lastIndex);
		}
	}

	static int getMaxIndex(int arr[], int start, int end) {
		int maxIndex = start;
		for (int i = start; i <= end; i++) {
			if (arr[i] > arr[maxIndex]) {
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
