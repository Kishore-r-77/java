package practice;

class Person extends Thread {
	String name;

	Person(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " hello " + this.name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Practice {

	public static void main(String[] args) {
		Person kishore = new Person("Kishore");
		Person ajay = new Person("Ajay");
		kishore.start();
		ajay.start();
	}

}
