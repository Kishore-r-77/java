package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Practice {
    public static void main(String[] args) {

        // leetcode 20

        // Input: s = "()"

        // Output: true

        String s = "([])";

        System.out.println(isValid(s));

    }

    static public boolean isValid(String s) {

        char[] charArray = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{') {
                stack.push(charArray[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (charArray[i] == ')' && top != '(' || charArray[i] == ']' && top != '['
                        || charArray[i] == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
