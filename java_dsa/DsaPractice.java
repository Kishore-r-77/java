package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 7, 2, 5, 10, 8 };
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));

	}

	static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			boolean isSwap=false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					isSwap=true;
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
			if(!isSwap) {
				break;
			}

		}
		return arr;
	}
}
