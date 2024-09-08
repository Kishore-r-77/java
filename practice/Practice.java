package practice;

class Practice {
	public static void main(String[] args) {

		// Input: strs = ["flower","flow","flight"]
		// Output: "fl"

		String[] strs = { "flower", "flow", "flight" };

		System.out.println(longestCommonPrefix(strs));

	}

	static public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		// Step 1: Assume the first string is the longest common prefix
		String prefix = strs[0];

		// Step 2: Compare the prefix with each subsequent string
		for (int i = 1; i < strs.length; i++) {
			// Step 3: Shorten the prefix as long as it's not a prefix of the current string

			while (strs[i].indexOf(prefix) != 0) {
				// Remove the last character from the prefix

				prefix = prefix.substring(0, prefix.length() - 1);

				// If the prefix becomes empty, there's no common prefix
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		// Step 4: Return the longest common prefix
		return prefix;

	}

}
