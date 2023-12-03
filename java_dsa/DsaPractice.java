package java_dsa;

import java.util.Arrays;

public class DsaPractice {
	public static void main(String[] args) {

		int nums[] = {1,4,2,5,66};
		
		System.out.println(search(nums, 66));

	}
	
	static boolean search(int[] nums,int val) {
		return Arrays.stream(nums).anyMatch(n->n==val);	
	}


	
}
