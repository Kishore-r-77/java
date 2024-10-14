package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 867

        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [[1,4,7],[2,5,8],[3,6,9]]

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },

        };

        System.out.println(Arrays.deepToString(transpose(matrix)));

    }

    static public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }

}
