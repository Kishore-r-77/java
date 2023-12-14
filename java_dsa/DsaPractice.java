package java_dsa;

import java.util.ArrayList;
import java.util.List;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 4,3,2,7,8,2,3,1 };
		findingTheMissingNumbers(nums);
		System.out.println(findingTheMissingNumbers(nums));
		

	}

	static List<Integer> findingTheMissingNumbers(int[] arr) {	
		
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
		List<Integer> ans = new ArrayList<>();
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=index+1) {
				ans.add(index+1);
			}
		}
		return ans;
				
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
