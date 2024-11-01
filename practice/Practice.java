package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 367

        // Input: num = 16
        // Output: true
        // Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

        System.out.println(isPerfectSquare(16));
    }

    static public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;

    }

}
