package practice;

class Person<T> {
	T something;

	Person(T something) {
		this.something = something;
	}

	<K, V> void display(K random1, V random2) {
		System.out.println("Hehe " + something + " " + random1 + " " + random2);
	}
}

class Practice {

	public static void main(String[] args) {
		Person<String> kishore = new Person<>("Hai Kishore");
		kishore.display(77, "Woah");
	}

}
