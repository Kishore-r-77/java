package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 168

        // Input: columnNumber = 1
        // Output: "A"

        System.out.println(convertToTitle(28));

    }

    static public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = (columnNumber) % 26;
            char value = (char) ('A' + remainder);
            sb.append(value);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

}
