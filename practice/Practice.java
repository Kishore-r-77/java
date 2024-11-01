package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 441

        // Input: n = 5
        // Output: 2
        // Explanation: Because the 3rd row is incomplete, we return 2.

        System.out.println(arrangeCoins(8));
    }

    static public int arrangeCoins(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long sum = (long) mid * (mid + 1) / 2;

            if (sum == n) {
                return mid;
            } else if (sum < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

}
