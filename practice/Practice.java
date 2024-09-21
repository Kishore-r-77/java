package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 657
        // Input: moves = "UD"
        // Output: true
        // Explanation: The robot moves up once, and then down once. All moves have the
        // same magnitude, so it ended up at the origin where it started. Therefore, we
        // return true.

        String moves = "UD";

        System.out.println(judgeCircle(moves));

    }

    static public boolean judgeCircle(String moves) {

        int vertical = 0;
        int horizontal = 0;
        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'U') {
                vertical += 1;

            } else if (moves.charAt(i) == 'D') {
                vertical -= 1;
            } else if (moves.charAt(i) == 'L') {
                horizontal -= 1;
            } else {
                horizontal += 1;
            }
        }
        return vertical == 0 && horizontal == 0;
    }

}
