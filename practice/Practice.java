package practice;

class Practice {
	public static void main(String[] args) {

		// Input: address = "1.1.1.1"
		// Output: "1[.]1[.]1[.]1"

		String address = "1.1.1.1";

		System.out.println(defangIPaddr(address));

	}

	static public String defangIPaddr(String address) {
		String output = "";

		char[] charArray = address.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '.') {
				output += "[.]";
			} else {
				output += charArray[i] + "";
			}
		}

		return output;
	}

}
