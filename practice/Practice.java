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
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

}
