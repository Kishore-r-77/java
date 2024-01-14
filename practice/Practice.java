package practice;

class Practice {

	public static void main(String[] args) {
		triangle2(5, 0);
	}

	static void triangle2(int r, int c) {
		if (r == 0) {
			return;
		}
		if (r > c) {
			triangle2(r, c + 1);
			System.out.print("*");
		} else {
			triangle2(r - 1, 0);
			System.out.println();
		}
	}

}
