package practice;

import java.util.Arrays;

class Practice {

	public static void main(String[] args) {
		String name1 = "Listen";
		String name2 = "Silent";

		System.out.println(isAnagram(name1, name2));

	}

	static Boolean isAnagram(String name1, String name2) {
		char[] array1 = name1.toLowerCase().toCharArray();
		char[] array2 = name2.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.println(array1);
		System.out.println(array1);

		System.out.println(array1);
		return Arrays.equals(array1, array2);

	}

}
