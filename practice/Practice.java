package practice;

class Practice {
	public static void main(String[] args) {

		// Input: command = "G()(al)"
		// Output: "Goal"

		String command = "G()(al)";

		System.out.println(interpret(command));

	}

	static public String interpret(String command) {

		String output = "";

		char[] charArray = command.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'G') {
				output += "G";
			} else if (charArray[i] == '(' && charArray[i + 1] == ')') {
				output += "o";
			} else if (charArray[i] == '(' && charArray[i + 1] == 'a' && charArray[i + 2] == 'l'
					&& charArray[i + 3] == ')') {
				output += "al";
			}

		}
		return output;

	}

}
