package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1886

        // Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
        // Output: true

        int[][] mat = {
                { 0, 1 },
                { 1, 0 },
        };
        int[][] target = {
                { 1, 0 },
                { 0, 1 },
        };

        // [[1, 2],
        // [3, 4]]

        // [[3, 1],
        // [4, 2]]

        // 4 3
        // 2 1

        System.out.println(findRotation(mat, target));

    }

    static public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (equals(mat, target)) {
                return true;
            }
            rotate(mat);
        }

        return false;

    }

    static public void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - 1 - j];
                mat[i][mat.length - 1 - j] = temp;
            }
        }

    }

    static public boolean equals(int[][] mat, int[][] target) {

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }

}
