package practice;

class Practice {

	public static void main(String[] args) {
		
		display(1);

	}
	
	static void display(int count) {
		if(count==5) {
			return;
		}
		
		System.out.println("Hello Kishore");
		display(++count);
		
		
	}

	
}
