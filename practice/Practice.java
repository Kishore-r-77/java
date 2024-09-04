package practice;

class Practice {
	public static void main(String[] args) {

		// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
		// Output: true

		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };

		System.out.println(arrayStringsAreEqual(word1, word2));

	}

	static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String result1 = "";
		String result2 = "";

		for (String word : word1) {
			result1 += word;
		}
		for (String word : word2) {
			result2 += word;
		}

		return result1.equals(result2);
	}
}
