package practice;

class Practice {

	public static void main(String[] args) {
		System.out.println(productOfDigits(1342));
	}

	static int productOfDigits(int n) {
		if (n == 0) {
			return 1;
		}
		int temp = n % 10;
		return temp * productOfDigits(n / 10);

	}

}
