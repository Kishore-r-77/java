package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1859
        // Input: s = "is2 sentence4 This1 a3"
        // Output: "This is a sentence"

        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));

    }

    static public String sortSentence(String s) {
        String[] splitString = s.split(" ");

        int[] order = new int[splitString.length];

        String[] result = new String[splitString.length];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length; i++) {
            order[i] = Integer.parseInt(splitString[i].charAt(splitString[i].length() - 1) + "") - 1;
        }

        for (int i = 0; i < order.length; i++) {
            result[order[i]] = splitString[i].substring(0, splitString[i].length() - 1);
        }

        ;

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i] + " ");
        }

        return sb.toString().trim();

    }

}
