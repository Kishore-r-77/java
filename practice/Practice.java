package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 989

        // Input: num = [1,2,0,0], k = 34
        // Output: [1,2,3,4]
        // Explanation: 1200 + 34 = 1234

        int[] num = { 1, 2, 0, 0 };

        System.out.println(addToArrayForm(num, 34));

    }

    static public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }
            result.add(k % 10);
            k /= 10;
            i--;
        }

        Collections.reverse(result);

        return result;
    }

}
