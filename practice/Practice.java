package practice;

interface Kishore {
	default void display() {
		System.out.println("I'm a Kishore");
	}
}

interface Ash {
	default void display() {
		System.out.println("I'm Ash");
	}
}

class Son implements Kishore, Ash {
	@Override
	public void display() {

		Ash.super.display();
	}

}

class Practice {
	public static void main(String[] args) {
		Son son = new Son();
		son.display();
	}

}
