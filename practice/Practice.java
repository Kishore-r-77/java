package practice;

import java.util.ArrayList;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [1,2,3,6,9,8,7,4,5]

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        System.out.println(spiralOrder(matrix));
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int left = 0;
        int right = matrix[0].length - 1;

        int up = 0;
        int down = matrix.length - 1;

        // left to right
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {

                result.add((matrix[up][i]));
            }
            up++;

            for (int i = up; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }

}
