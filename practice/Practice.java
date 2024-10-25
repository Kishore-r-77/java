package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 372

        // Input: n = 10, pick = 6
        // Output: 6

    }

    static public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == 1) {
                start = mid + 1;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    // this is a predefined api fn for the problem
    static public int guess(int num) {
        return 0;
    }

}
