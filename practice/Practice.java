package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // leetcode 832

        // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        // Output: [[1,0,0],[0,1,0],[1,1,1]]
        // Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
        // Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 },
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }

    static public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            swap(0, image[i].length - 1, image[i]);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;
            }
        }

        return image;
    }

    static public void swap(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

}
