package java_dsa;

import java.util.Arrays;

public class DsaPractice {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		cyclicSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}

	static void cyclicSort(int[] arr, int low, int high) {

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
