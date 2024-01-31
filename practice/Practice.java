package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {

	public static void main(String[] args) {
		List<Integer> listArray = new ArrayList<>(List.of(1, 2, 3));
		listArray.add(4);

		listArray.add(0, 7);

		System.out.println(listArray);

	}

}
