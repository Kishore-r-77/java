package practice;

import java.util.Arrays;

class Practice {

	public static void main(String[] args) {

	varargexample(1,4,5,62,3);
		
	}
	
	public static void varargexample(int ...x) {
		System.out.println(x.getClass().getSimpleName());
	}

}
