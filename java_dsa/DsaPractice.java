package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 7, 2, 5, 10, 8 };
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
		

	}

	static void insertionSort(int[] arr) {	
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swapArray(arr, j, j-1);
				}
			}
		}
				
	}
	
	static void swapArray(int arr[],int index1, int index2) {
		if (index1 >= arr.length || index2 >= arr.length) {
		    System.out.println("Then index is out of bound");
		}
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
	
}
