package practice;

class Practice {
	public static void main(String[] args) {

		String input1 = "10.1.05";
		String input2 = "10.01.4";

		int result = compareVersions(input1, input2);

		if (result > 0) {
			System.out.println(input1 + " is greater than " + input2);
		} else if (result < 0) {
			System.out.println(input2 + " is greater than " + input1);
		} else {
			System.out.println(input1 + " is equal to " + input2);
		}

	}

	static public int compareVersions(String version1, String version2) {
		String[] v1Parts = version1.split("\\.");
		String[] v2Parts = version2.split("\\.");

		int maxlength = v1Parts.length < v2Parts.length ? v2Parts.length : v1Parts.length;

		for (int i = 0; i < maxlength; i++) {

			int v1 = i < v1Parts.length ? Integer.parseInt(v1Parts[i]) : 0;
			int v2 = i < v1Parts.length ? Integer.parseInt(v2Parts[i]) : 0;

			if (v1 > v2) {
				return 1;
			} else if (v2 > v1) {
				return -1;
			}

		}

		return 0;
	}
}
