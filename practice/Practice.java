package practice;

class Practice {

	public static void main(String[] args) {
		triangle1(5, 0);
	}

	static void triangle1(int r, int c) {
		if (r == 0) {
			return;
		}
		if (r > c) {
			System.out.print("*");
			triangle1(r, c + 1);
		} else {
			System.out.println();
			triangle1(r - 1, 0);
		}
	}

}
