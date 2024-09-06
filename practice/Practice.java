package practice;

class Practice {
	public static void main(String[] args) {

		// Input: s = "10#11#12"
		// Output: "jkab"

		String s = "10#11#12";

		System.out.println(freqAlphabets(s));

		System.out.println((char) ('a' + 0));

	}

	static public String freqAlphabets(String s) {

		StringBuilder builder = new StringBuilder();
		int i = 0;
		while (i < s.length()) {

			if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
				int num = Integer.parseInt(s.substring(i, i + 2));
				builder.append((char) ('a' + num - 1));
				i += 3;
			} else {
				int num = s.charAt(i) - '0';
				builder.append((char) ('a' + num - 1));
				i++;
			}
		}

		return builder.toString();
	}
}
