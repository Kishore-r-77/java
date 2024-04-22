package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
	public static void main(String[] args) {
		// Input: address = "1.1.1.1"
		// Output: "1[.]1[.]1[.]1"

		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));

	}

	static public String defangIPaddr(String address) {
		char[] charArray = address.toCharArray();
		List<String> letters = new ArrayList<>();
		String output = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '.') {

				letters.add("[.]");
			} else {

				letters.add(charArray[i] + "");
			}

		}
		for (String letter : letters) {
			output += letter;
		}

		return output;
	}
}
