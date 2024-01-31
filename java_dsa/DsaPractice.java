package java_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DsaPractice {
	// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
	// Output: true
	public static void main(String[] args) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String sentence = "leetcode";
		System.out.println(isPangram(alphabets, sentence));
	}

	static boolean isPangram(String alphabets, String sentence) {

		char[] charArray = alphabets.toCharArray();
		for (char letter : charArray) {
			String letterElements = String.valueOf(letter);
			return sentence.contains(letterElements);

		}
		return false;
	}

}
