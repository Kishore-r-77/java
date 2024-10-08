package practice;

import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1732

        // Input: gain = [-5,1,5,0,-7]
        // Output: 1
        // Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

        int[] gain = { -5, 1, 5, 0, -7 };

        System.out.println(largestAltitude(gain));

    }

    static public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > max) {
                max = altitude;
            }
        }

        return max;

    }

}
