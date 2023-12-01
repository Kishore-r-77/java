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
	
	void insertAtPos(int pos,int val) {
		if(size==capacity) {
			expandArray();
		}
		for(int i = size-1;i>=pos;i--)
			arr[i+1]=arr[i];
		arr[pos]=val;
		size++;
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
		int inputVal, pos;
		MyArrayList list = new MyArrayList();
		
		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			System.out.println("------- List of Key Inputs for Performing the Provided Operations-------");
			System.out.println("1.Enter 1 for Adding Value at the end to an Array ");
			System.out.println("2.Enter 2 to Display the Arrays");
			System.out.println("3.Enter 3 to Insert value in an Array of your desired position.");
			System.out.println("4.Enter 4 to Delete a value in an Array.");
			System.out.println("5.Enter 5 for Exit");
			System.out.println("\n------------------------------------------------------------------------\n");
			System.out.println("Enter your're choice");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("Enter the Number to be Added in the Array");
				inputVal = scanner.nextInt();
				list.addValue(inputVal);
			}
			case 2 ->{
				list.display();
				
			}
			case 3 -> {
				System.out.println("Enter the Position");
				pos=scanner.nextInt();
				if(pos<0) {
					System.out.println("Invalid Position");
					break;
				}
				System.out.println("Enter the Value");
				inputVal=scanner.nextInt();
				list.insertAtPos(pos, inputVal);
			}
			
			case 5 -> {
				scanner.close();
				System.exit(0);

			}
			default -> {
				System.out.println("Entered wrong Key");
			}
			}
			

		}

	}
}
