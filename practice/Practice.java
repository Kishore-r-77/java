package practice;

import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1773
        // Input: items =
        // [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
        // ruleKey = "color", ruleValue = "silver"
        // Output: 1

        // Input: items =
        // [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
        // ruleKey = "type", ruleValue = "phone"
        // Output: 2

        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));

        List<List<String>> items2 = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone"));

        System.out.println(countMatches(items2, "type", "phone"));

    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")) {
                if (ruleValue.equals(items.get(i).get(0))) {
                    count++;
                }
            } else if (ruleKey.equals("color")) {
                if (ruleValue.equals(items.get(i).get(1))) {
                    count++;
                }
            } else if (ruleKey.equals("name")) {
                if (ruleValue.equals(items.get(i).get(2))) {
                    count++;
                }
            }
        }

        return count;
    }

}
