package practice;

import java.util.LinkedList;
import java.util.Queue;

class Practice {
    public static void main(String[] args) {

        // leetcode 1871

        // Input: s = "011010", minJump = 2, maxJump = 3
        // Output: true
        // Explanation:
        // In the first step, move from index 0 to index 3.
        // In the second step, move from index 3 to index 5.

        String s = "011010";

        System.out.println(canReach(s, 2, 3));

    }

    static public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();
        if (s.charAt(n - 1) != '0')
            return false;

        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);

        int maxReach = 0;

        while (!queue.isEmpty()) {
            int idx = queue.remove();
            if (idx == n - 1) {
                return true;
            }

            for (int i = Math.max(idx + minJump, maxReach); i <= Math.min(idx + maxJump, n - 1); i++) {
                if (s.charAt(i) == '0') {
                    queue.add(i);
                }

            }
            maxReach = Math.min(idx + maxJump, n - 1);

        }

        return false;
    }
}
