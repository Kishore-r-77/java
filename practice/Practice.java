package practice;

import java.util.Scanner;

class Practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = scanner.nextLine();
		
		System.out.println("What is your age?");
		
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("What's you're email?");
		
		String email = scanner.nextLine();
		
		System.out.println(name+" "+" "+age+" "+email);
		
		scanner.close();
		
		
		
		
	}
}
