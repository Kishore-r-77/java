package java_practice;

class Animal {
	int age;
	String name;

	Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void display() {
		System.out.println(name + "-" + age);
	}
	void show() {
		System.out.println("Test");
	}
}

class Cat extends Animal {
	String category;

	Cat(int age, String name, String category) {
		super(age, name);
		this.category = category;
	}
	void display() {
		System.out.println(name+"-"+age+"-"+category);
		show();
	}

}

class Practice {

	public static void main(String[] args) {
		Animal cat = new Cat(4,"Ricky","Mammal");
		
		cat.display();
	}
}
