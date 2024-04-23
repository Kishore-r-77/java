package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
	public static void main(String[] args) {
		// Input: word1 = "abc", word2 = "pqr"
		// Output: "apbqcr"

		String word1 = "abc";
		String word2 = "pqr";

		System.out.println(mergeAlternately(word1, word2));
	}

	static public String mergeAlternately(String word1, String word2) {
		String output = "";
		List<String> resultArray = new ArrayList<>();
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		int minlength = Math.min(word1Array.length, word2Array.length);
		for (int i = 0; i < minlength; i++) {
			resultArray.add(word1Array[i] + "");
			resultArray.add(word2Array[i] + "");
		}
		for (int i = minlength; i < word1Array.length; i++) {
			resultArray.add(word1Array[i] + "");
		}
		for (int i = minlength; i < word2Array.length; i++) {
			resultArray.add(word2Array[i] + "");
		}
		for (String c : resultArray) {
			output += c;
		}
		return output;
	}

}
