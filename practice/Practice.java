package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
	public static void main(String[] args) {

		// Input: items =
		// [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
		// ruleKey = "color", ruleValue = "silver"
		// Output: 1

		List<List<String>> items = new ArrayList<>(
				new ArrayList<>(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"),
						List.of("phone", "gold", "iphone"))));

		System.out.println(countMatches(items, "color", "silver"));

	}

	static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		if (ruleKey.equalsIgnoreCase("type")) {
			for (int i = 0; i < items.size(); i++) {
				String typeValue = items.get(i).get(0);
				if (ruleValue.equals(typeValue)) {
					count++;
				}
			}
		} else if (ruleKey.equalsIgnoreCase("color")) {
			for (int i = 0; i < items.size(); i++) {
				String typeValue = items.get(i).get(1);
				if (ruleValue.equals(typeValue)) {
					count++;
				}
			}
		} else {
			for (int i = 0; i < items.size(); i++) {
				String typeValue = items.get(i).get(2);
				if (ruleValue.equals(typeValue)) {
					count++;
				}
			}
		}

		return count;
	}

}
