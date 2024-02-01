package java_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsaPractice {
	// Input: items =
	// [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
	// ruleKey = "color", ruleValue = "silver"
	// Output: 1
	// Explanation: There is only one item matching the given rule, which is
	// ["computer","silver","lenovo"].
	public static void main(String[] args) {
		List<String> item1 = Arrays.asList("phone", "blue", "pixel");
		List<String> item2 = Arrays.asList("computer", "silver", "phone");
		List<String> item3 = Arrays.asList("phone", "gold", "iphone");

		List<List<String>> listItems = new ArrayList<>(Arrays.asList(item1, item2, item3));
		System.out.println(countMatches(listItems, "type", "phone"));
	}

	static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;

		int ruleIndex = -1;
		if (ruleKey.equals("type")) {
			ruleIndex = 0;
		} else if (ruleKey.equals("color")) {
			ruleIndex = 1;
		} else if (ruleKey.equals("name")) {
			ruleIndex = 2;
		}

		if (ruleIndex != -1) {
			for (List<String> item : items) {
				if (item.get(ruleIndex).equals(ruleValue)) {
					count++;
				}
			}
		}

		return count;
	}
}
