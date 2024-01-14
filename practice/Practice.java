package practice;

class Practice {

	public static void main(String[] args) {
		nto1(5);
	}

	static void nto1(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		nto1(n - 1);
	}

}
