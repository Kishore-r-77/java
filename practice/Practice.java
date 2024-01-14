package practice;

class Practice {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(1342));
	}

	static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		}
		int temp = n % 10;
		return temp + sumOfDigits(n / 10);

	}

}
