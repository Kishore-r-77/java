package java_dsa;

public class DsaPractice {
	// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
	// Output: true
	public static void main(String[] args) {

		String sentence = "anmt";
		System.out.println(checkIfPangram(sentence));
	}

	static boolean checkIfPangram(String sentence) {
		char ch = 'a';
		for (int i = 0; i < 26; i++)
			if (sentence.contains(String.valueOf(ch)))
				ch++;
			else
				return false;
		return true;
	}

}
