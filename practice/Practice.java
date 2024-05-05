package practice;

class Practice {
	public static void main(String[] args) {

		int n = 5;
		pattern(n);

	}

	static void pattern(int n) {
		for (int i = 0; i <= 2 * n; i++) {
			int c = i > n ? 2 * n - i : i;
			for (int j = 0; j < c; j++) {
				if (j == 0 || j == c - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n - c; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - c; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < c; j++) {
				if (j == 0 || j == c - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
