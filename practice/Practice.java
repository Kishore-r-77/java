package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1217

        // Input: position = [1,2,3]
        // Output: 1
        // Explanation: First step: Move the chip at position 3 to position 1 with cost
        // = 0.
        // Second step: Move the chip at position 2 to position 1 with cost = 1.
        // Total cost is 1.

        int[] position = { 1, 2, 3 };
        System.out.println(minCostToMoveChips(position));

    }

    static public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        int min = 0;

        for (int chip : position) {
            if (chip % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (oddCount > evenCount) {
            min = evenCount;
        } else {
            min = oddCount;
        }

        return min;
    }

}
