package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 3,5,2,1,4 };
		cyclicSort(nums);
		System.out.println(Arrays.toString(nums));
		

	}

	static void cyclicSort(int[] arr) {	
		
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swapArray(arr, i, correct);
			}
			else {
				i++;
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
