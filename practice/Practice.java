package practice;

import java.util.Arrays;

class CustomArrays {
	int arr[];
	int capacity;
	int size;
	final int DEFAULT_CAPACITY = 10;

	CustomArrays() {
		capacity = DEFAULT_CAPACITY;
		arr = new int[capacity];
	}

	void add(int val) {
		if (size == capacity) {
			expandArray();
		}
		arr[size++] = val;
	}

	void insertAtPosition(int pos, int val) {
		if (pos < 0 || pos > size) {
			System.out.println("Invalid position");
			return;
		}
		if (size == capacity) {
			expandArray();
		}
		for (int i = size - 1; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = val;
		size++;
	}

	void deleteAtPos(int pos) {
		if (pos < 0 || pos >= size) {
			System.out.println("Invalid position");
			return;
		}
		for (int i = pos + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		size--;
		if (capacity > DEFAULT_CAPACITY && capacity > 3 * size) {
			shrinkArray();
		}
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	void expandArray() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);
	}

	void shrinkArray() {
		capacity /= 2;
		arr = Arrays.copyOf(arr, capacity);
	}
}

class Practice {
	public static void main(String[] args) {
		CustomArrays arrays = new CustomArrays();

		arrays.add(1);
		arrays.add(2);
		arrays.insertAtPosition(9, 10);
		arrays.deleteAtPos(9);

		arrays.display();

	}

}
