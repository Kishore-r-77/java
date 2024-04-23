package practice;

class Practice {
	public static void main(String[] args) {
		// Input: s = "A man, a plan, a canal: Panama"
		// Output: true

		String s = "abca";

		System.out.println(validPalindrome(s));
	}

	static public boolean validPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				if (isPalindrome(start + 1, end, s)) {
					return true;
				}
				if (isPalindrome(start, end - 1, s)) {
					return true;
				}
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

	static public boolean isPalindrome(int start, int end, String s) {

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {

				return false;
			}
			start++;
			end--;
		}
		return true;

	}

}
