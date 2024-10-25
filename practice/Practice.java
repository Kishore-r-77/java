package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 278

        // Input: n = 5, bad = 4
        // Output: 4
        // Explanation:
        // call isBadVersion(3) -> false
        // call isBadVersion(5) -> true
        // call isBadVersion(4) -> true
        // Then 4 is the first bad version.

    }

    static public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int badVersion = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid - 1;
                badVersion = mid;
            } else {
                start = mid + 1;
            }
        }
        return badVersion;
    }

    // this is a predefined api fn for the problem
    static public boolean isBadVersion(int num) {
        return false;
    }

}
