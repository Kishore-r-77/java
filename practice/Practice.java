package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Practice {
    public static void main(String[] args) {

        // leetcode 888

        // Input: aliceSizes = [1,1], bobSizes = [2,2]
        // Output: [1,2]

        int[] aliceSizes = { 1, 1 };
        int[] bobSizes = { 2, 2 };

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));

    }

    static public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0, sumB = 0;
        Set<Integer> setB = new HashSet<>();

        for (int a : aliceSizes) {
            sumA += a;
        }
        for (int b : bobSizes) {
            sumB += b;
            setB.add(b);
        }
        int diff = (sumB - sumA) / 2;
        for (Integer a : aliceSizes) {
            if (setB.contains(a + diff)) {
                return new int[] { a, a + diff };
            }
        }

        return new int[0];
    }

}
