package practice;

import java.util.List;

class Practice {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 7);
		nums.stream().forEach(System.out::println);
	}

}
