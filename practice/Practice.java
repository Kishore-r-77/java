package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
	public static void main(String[] args) {

		// Input: s = "is2 sentence4 This1 a3"
		// Output: "This is a sentence"

		String s = "is2 sentence4 This1 a3";

		System.out.println(sortSentence(s));

	}

	static public String sortSentence(String s) {

		String[] stringArray = s.split(" ");
		int[] indexes = new int[stringArray.length];
		String[] outputList = new String[stringArray.length];

		String result = "";

		for (int i = 0; i < indexes.length; i++) {
			indexes[i] = Integer.parseInt(stringArray[i].charAt(stringArray[i].length() -
					1) + "");
			stringArray[i] = stringArray[i].substring(0, stringArray[i].length() - 1);

		}

		for (int i = 0; i < outputList.length; i++) {
			outputList[indexes[i] - 1] = stringArray[i];
		}
		for (int i = 0; i < outputList.length; i++) {
			result = result + outputList[i] + " ";
		}

		return result.trim();
	}

}
