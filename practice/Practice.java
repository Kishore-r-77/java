package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 832

        // Input: m = 2, n = 3, indices = [[0,1],[1,1]]
        // Output: 6
        // Explanation: Initial matrix = [[0,0,0],[0,0,0]].
        // After applying first increment it becomes [[1,2,1],[0,1,0]].
        // The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

        int[][] indices = {
                { 0, 1 },
                { 1, 1 },
        };

        // {
        // {1,3,1},
        // {1,3,1},
        // }

        System.out.println(oddCells(2, 3, indices));

    }

    static public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            for (int i = 0; i < n; i++) {
                matrix[row][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }

        for (int[] row : matrix) {
			for (int num : row) {
				if (num % 2 != 0) {
					count++;
				}
			}
		}

        return count;
    }

}
