package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1672

        // Input: accounts = [[1,5],[7,3],[3,5]]
        // Output: 10
        // Explanation:
        // 1st customer has wealth = 6
        // 2nd customer has wealth = 10
        // 3rd customer has wealth = 8
        // The 2nd customer is the richest with a wealth of 10.

        int[][] accounts = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 },
        };

        System.out.println(maximumWealth(accounts));

    }

    static public int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;

    }

}
