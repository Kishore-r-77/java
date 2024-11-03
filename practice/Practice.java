package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1351

        // Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
        // Output: 8
        // Explanation: There are 8 negatives number in the matrix.

        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 },
        };

        System.out.println(countNegatives(grid));

    }

    static public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] arr : grid) {
            count += findNegative(arr);
        }

        return count;
    }

    static int findNegative(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        count += arr.length - start;

        return count;
    }
}
