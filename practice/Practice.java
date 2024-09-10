package practice;

import java.util.Arrays;

class Practice {
    public static void main(String[] args) {

        // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        // Output: [[1,0,0],[0,1,0],[1,1,1]]

        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 },
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }

    static public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            swap(image[i], 0, image.length - 1);

        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                image[i][j] = image[i][j] ^ 1;
            }
        }

        return image;
    }

    static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
