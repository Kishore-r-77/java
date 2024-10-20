package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // leetcode 1380

        // Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        // Output: [15]
        // Explanation: 15 is the only lucky number since it is the minimum in its row
        // and the maximum in its column.

        int[][] matrix = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 },
        };

        System.out.println(luckyNumbers(matrix));

    }

    static public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minRow = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (minRow > matrix[i][j]) {
                    minRow = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isMax = true;
            for (int j = 0; j < matrix.length; j++) {
                if (minRow < matrix[j][colIndex]) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) {
                result.add(minRow);
            }

        }

        return result;
    }

}
