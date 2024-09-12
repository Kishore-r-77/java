package practice;

class Practice {
    public static void main(String[] args) {
        // Input: m = 2, n = 3, indices = [[0,1],[1,1]]
        // Output: 6

        int m = 2;
        int n = 3;

        int[][] indices = {
                { 0, 1 },
                { 1, 1 },
        };

        System.out.println(oddCells(m, n, indices));

    }

    static public int oddCells(int m, int n, int[][] indices) {
        int oddCount = 0;

        int[][] matrix = new int[m][n];

        for (int[] index : indices) {

            int row = index[0];
            int col = index[1];

            for (int i = 0; i < n; i++) {
                matrix[row][i] += 1;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][col] += 1;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
