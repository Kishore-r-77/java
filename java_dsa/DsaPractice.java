package java_dsa;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class DsaPractice {
	public static void main(String[] args) {

		Integer nums[] = { 1, 4, 2, 5, 66 };

		System.out.println(search.test(nums, 66));

	}

//	static boolean search(int[] nums,int val) {
//		return Arrays.stream(nums).anyMatch(n->n==val);	
//	}

	static BiPredicate<Integer[], Integer> search = (arr, val) -> Arrays.stream(arr).anyMatch(n -> n == val);

}
