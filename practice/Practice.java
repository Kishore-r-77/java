package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1346

        // Input: arr = [10,2,5,3]
        // Output: true
        // Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

        int[] arr = { 7, 1, 14, 11 };

        System.out.println(checkIfExist(arr));

    }

    static public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else if (arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
