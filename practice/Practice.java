package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [[1,4,7],[2,5,8],[3,6,9]]

        int[][] nums = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        System.out.println(Arrays.deepToString(transpose(nums)));

    }

    static public int[][] transpose(int[][] matrix) {

        int result[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

}
