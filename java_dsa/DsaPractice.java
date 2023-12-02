package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

//		swapArray(nums, 1, 4);
		
//		reverseArray(nums);
		reverseArrayoOnRange(nums, 1, 4);
		System.out.println(Arrays.toString(nums));

	}

	static void swapArray(int arr[], int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while(start<end) {
			swapArray(arr, start, end);
			start++;
			end--;
		}
		
	}
	
	static void reverseArrayoOnRange(int arr[],int pos1, int pos2) {
		int start = pos1;
		int end = pos2;
		if(start>end) {
			System.out.println("Position cannot be Greater than Position 2");
		}
		if(end>arr.length-1) {
			System.out.println("Index out of Bound Brother.");
		}
		while(start<end) {
			swapArray(arr, start, end);
			start++;
			end--;
		}
		
	}
}
