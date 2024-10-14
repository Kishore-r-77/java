package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1572

        // Input: mat = [[1,2,3],
        // [4,5,6],
        // [7,8,9]]
        // Output: 25
        // Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
        // Notice that element mat[1][1] = 5 is counted only once.

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        System.out.println(diagonalSum(mat));

    }

    static public int diagonalSum(int[][] mat) {

        int sum = 0;

        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[n - i - 1][i];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;

    }

}
