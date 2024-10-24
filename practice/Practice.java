package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 69

        // Input: x = 4
        // Output: 2
        // Explanation: The square root of 4 is 2, so we return 2.

        System.out.println(mySqrt(8));

    }

    static public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else if ((long) mid * mid < (long) x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }

}
