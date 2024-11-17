package practice;

class Practice {
    public static void main(String[] args) {

        // Input: n = 10
        // Output: 1 2 3 4 5 6 7 8 9 10

        printToN(5);

    }

    static public void printToN(int n) {
        recursivePrint(n, 0);
    }

    static public void recursivePrint(int n, int count) {
        if (count == n) {
            return;
        }
        count++;
        System.out.println(count);
        recursivePrint(n, count);
    }

}
