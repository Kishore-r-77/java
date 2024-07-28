package practice;

class Practice {
	public static void main(String[] args) {
		recursion(0);
	}

	static public void recursion(int n) {
		if (n == 5) {
			return;
		}
		System.out.println("The number is " + n);
		recursion(n++);
	}

}
