package practice;

class Practice {

	public static void main(String[] args) {
		onetToN(5);
	}

	static void onetToN(int n) {

		if (n == 0) {
			return;
		}

		onetToN(n - 1);
		System.out.print(n + " ");
	}

}
