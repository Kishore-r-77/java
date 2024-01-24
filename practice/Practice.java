package practice;

abstract class Animal {
	String name;
	String category;

	abstract void makeNoise();

	void display() {
		System.out.println("I'm animal");
	}
}

class Cat extends Animal {

	@Override
	void makeNoise() {
		System.out.println("Meow Meow");
	}

	void display() {
		System.out.println("I'm Cat");
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

}

class Practice {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("Kitty");
		cat.makeNoise();
		System.out.println(cat.name);
	}

}
