package logic_first_dsa;

import java.util.Arrays;
import java.util.Scanner;

class MyArrayList {
	private static final int INITIAL_CAPACITY = 4;
	private int size;
	int arr[];
	int capacity;

	MyArrayList() {
		size = 0;
		arr = new int[INITIAL_CAPACITY];
		capacity = INITIAL_CAPACITY;
	}

	void addValue(int val) {
		if (size == capacity) {
			expandArray();
		}
		arr[size++] = val;
	}

	void expandArray() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);
	}

	void display() {
		Arrays.stream(arr).forEach((num) -> System.out.print(num + " "));
	}

}

public class DynamicArray {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		System.out.println("------- List of Key Inputs for Performing the Provided Operations-------");
		System.out.println("1.Enter 1 for Adding Value to the Array ");
		System.out.println("5.Enter 5 for Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		while (true) {
			switch (choice) {
			case 1 -> {
				System.out.println("Enter the Number to be Added in the Array");
				int inputVal = scanner.nextInt();
				list.addValue(inputVal);
				list.display();
			}
			case 2->{
				list.display();
			}
			case 5 -> {
				scanner.close();
				System.exit(0);
				
			}
			default -> {
				System.out.println("Entered wrong Key");
			}
			}
//			scanner.close();

		}

	}
}
