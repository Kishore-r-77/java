package practice;

class Practice {

	public static void main(String[] args) {
		System.out.println(sumOf1ToN(5));
	}

	static int sumOf1ToN(int n) {
		if (n <= 1) {
			return 1;
		}
		return n + sumOf1ToN(n - 1);

	}

}
