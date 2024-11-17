package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 509
        // Input: n = 2
        // Output: 1
        // Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

        // 0,1,1,2,3,5,8,13

        System.out.println(fib(4));

    }

    static public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int output = 0;

        for (int i = 2; i <= n; i++) {
            output = n1 + n2;
            n1 = n2;
            n2 = output;
        }

        return output;
    }

}
