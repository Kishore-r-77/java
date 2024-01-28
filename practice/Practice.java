package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Practice {

	public static void main(String[] args) {
		List<Integer> listArray = new ArrayList<>(List.of(1, 2, 3));
		List<Integer> listArray2 = new ArrayList<>(Arrays.asList(1, 2, 3, null));
		listArray.add(4);
		listArray2.add(4);
		System.out.println(listArray);
		System.out.println(listArray2);
		Map<String, String> person = new HashMap<>();
		person.put("name", "Kishore");
		person.put("age", "27");
		person.put("role", "FullStack Developer");
		person.put("company", "Netflix");

	}

}
