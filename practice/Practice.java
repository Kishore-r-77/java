package practice;

class Practice {

	public static void main(String[] args) {
		String name = "abcba";
		System.out.println(isPalindrome(name));

	}

	static Boolean isPalindrome(String name) {
		char[] charArray = name.toCharArray();
		String str = name.toLowerCase();

		for (int i = 0; i < charArray.length / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(charArray.length - 1 - i);
			if (start == end) {
				return true;
			}

		}
		return false;
	}

}
