package practice;

class Practice {
	public static void main(String[] args) {

		// Input: moves = "UD"
		// Output: true

		String moves = "UD";

		System.out.println(judgeCircle(moves));

	}

	static public boolean judgeCircle(String moves) {
		int leftCount = 0;
		int rightCount = 0;
		int upCount = 0;
		int downcount = 0;

		char[] directions = moves.toCharArray();

		for (int i = 0; i < directions.length; i++) {
			if (directions[i] == 'L') {
				leftCount++;
			} else if (directions[i] == 'R') {
				rightCount++;
			} else if (directions[i] == 'U') {
				upCount++;
			} else {
				downcount++;
			}
		}

		return leftCount - rightCount == 0 && upCount - downcount == 0;
	}
}
