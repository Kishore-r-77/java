package practice;

class Practice {
	public static void main(String[] args) {

		// Input: s = "book"
		// Output: true

		String s = "book";

		System.out.println(halvesAreAlike(s));

	}

	static public boolean halvesAreAlike(String s) {
		int mid = s.length() / 2;
		String firstHalf = s.substring(0, mid);
		String secondHalf = s.substring(mid, s.length());

		char[] firstHalfArray = firstHalf.toCharArray();
		char[] secondHalfArray = secondHalf.toCharArray();

		int a = 0;
		int b = 0;
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < firstHalfArray.length; i++) {
			if (vowels.contains(firstHalfArray[i] + "")) {
				a++;
			}
			if (vowels.contains(secondHalfArray[i] + "")) {
				b++;
			}
		}

		return a == b;
	}
}
