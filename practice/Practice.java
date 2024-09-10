package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // Input: gain = [-5,1,5,0,-7]
        // Output: 1

        int[] gain = { -5, 1, 5, 0, -7 };

        System.out.println(largestAltitude(gain));

    }

    static public int largestAltitude(int[] gain) {
        int altitude = 0;

        int max = 0;

        for (int i = 0; i < gain.length - 1; i++) {
            altitude += gain[i];
            if (max < altitude) {
                max = altitude;
            }
        }

        return max;
    }

}
