package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1539

        // Input: arr = [2,3,4,7,11], k = 5
        // Output: 9
        // Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The
        // 5th missing positive integer is 9.

        int[] arr = { 2, 3, 4, 7, 11 };

        System.out.println(findKthPositive(arr, 5));
    }

    static public int findKthPositive(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start + k;

    }

}
