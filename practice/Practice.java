package practice;

import java.util.Arrays;

class Practice {
	public static void main(String[] args) {

		// Input: s = "Let's take LeetCode contest"
		// Output: "s'teL ekat edoCteeL tsetnoc"

		String s = "Let's take LeetCode contest";

		System.out.println(reverseWords(s));

	}

	static public String reverseWords(String s) {

		String output = "";

		String[] stringArray = s.split(" ");

		for (String word : stringArray) {
			output += reverse(word) + " ";
		}

		return output.trim();

	}

	static public String reverse(String s) {
		char[] charArray = s.toCharArray();

		int start = 0;
		int end = s.length() - 1;
		String output = "";

		while (start <= end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < charArray.length; i++) {
			output += charArray[i];
		}
		return output;
	}
}
