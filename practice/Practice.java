package practice;

class Practice {
    public static void main(String[] args) {
        // Input: mat = [[1,2,3],
        // [4,5,6],
        // [7,8,9]]
        // Output: 25

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

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
