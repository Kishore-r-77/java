package practice;

import java.util.function.Function;

class Practice {

	public static void main(String[] args) {
		
		Function<Integer, Integer> a = (n1)->n1+n1;
		
		Integer result = a.apply(7);
		
		System.out.println(result);
		
		
	}
}
