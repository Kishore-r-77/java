package practice;

import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1773

        // Input: items =
        // [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
        // ruleKey = "color", ruleValue = "silver"
        // Output: 1
        // Explanation: There is only one item matching the given rule, which is
        // ["computer","silver","lenovo"].

        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));

        System.out.println(countMatches(items, "color", "silver"));

    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int index = 0;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;

            default:
                return 0;

        }

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

}
