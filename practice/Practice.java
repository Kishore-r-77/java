package practice;

class Practice {
	public static void main(String[] args) {

		// Input: s = "aba"
		// Output: true

		String s = "abca";

		System.out.println(validPalindrome(s));

	}

	static public boolean validPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				if (isPalindrome(left + 1, right, s)) {
					return true;
				}
				if (isPalindrome(left, right - 1, s)) {
					return true;
				}
				return false;
			}
			left++;
			right--;

		}

		return true;

	}

	static public boolean isPalindrome(int left, int right, String s) {

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}

		return true;
	}

}
