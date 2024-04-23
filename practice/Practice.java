package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
	public static void main(String[] args) {
		// Input: s = "A man, a plan, a canal: Panama"
		// Output: true

		String s = "A man, a plan, a canal: Panama";

		System.out.println(isPalindrome(s));
	}

	static public boolean isPalindrome(String input) {
		char[] inputArray = input.toLowerCase().toCharArray();

		List<Character> listOfCharacter = new ArrayList<>();
		for (char c : inputArray) {
			if (Character.isLetterOrDigit(c)) {
				listOfCharacter.add(c);
			}
		}
		int start = 0;
		int end = listOfCharacter.size() - 1;
		System.out.println(listOfCharacter);
		while (start < end) {
			if (listOfCharacter.get(start) != listOfCharacter.get(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

}
