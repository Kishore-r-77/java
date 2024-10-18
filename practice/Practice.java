package practice;

import java.util.HashMap;

class Practice {
    public static void main(String[] args) {

        // leetcode 1304

        // Input: n = 5
        // Output: [-7,-1,1,3,4]
        // Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

        System.out.println(sumZero(5));

    }

    static public int[] sumZero(int n) {

        int[] arr = new int[n];
        int value = 1;

        for (int i = 0; i < n / 2; i++) {
            arr[i] = value;
            arr[n - i - 1] = -value;
            value++;
        }

        if (n / 2 != 0) {
            arr[n / 2] = 0;
        }
        return arr;
    }

}
