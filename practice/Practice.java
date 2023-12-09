package practice;

import java.util.Arrays;

class Practice {

	public static void main(String[] args) {

		int nums[]= {1,8,9,22};
		System.out.println(Arrays.toString(twoSum(nums, 300)));

	}
		
	static int[] twoSum(int[] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	
	
}
