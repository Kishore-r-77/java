package java_dsa;

import java.util.Arrays;

public class DsaPractice {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		cycleSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void cycleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != correctIndex) {
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
