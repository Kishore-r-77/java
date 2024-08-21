package practice;

import java.util.Arrays;

class CustomArrays {
	int data[];

	int size;

	int capacity;

	int DEFAULT_CAPACITY = 10;

	CustomArrays() {
		this.capacity = DEFAULT_CAPACITY;
		this.data = new int[capacity];
	}

	void expandArray() {
		capacity *= 2;
		data = Arrays.copyOf(data, capacity);
	}

	void shrinkArray() {
		capacity /= 2;
		data = Arrays.copyOf(data, capacity);
	}

	void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	void add(int val) {
		if (size == capacity) {
			expandArray();
		}
		data[size++] = val;
	}

	// [3,2,5,2,7,9,8]
	void insertAtPos(int val, int pos) {
		if (size == capacity) {
			expandArray();
		}
		for (int i = size - 1; i >= pos; i--) {
			data[i + 1] = data[i];
		}
		data[pos] = val;
		size++;
	}

	void deleteAtEnd() {

	}
}

class Practice {
	public static void main(String[] args) {
		CustomArrays customArrays = new CustomArrays();
		customArrays.add(1);
		customArrays.add(2);
		customArrays.add(3);
		customArrays.add(4);
		customArrays.insertAtPos(7, 1);
		customArrays.display();
	}

}
