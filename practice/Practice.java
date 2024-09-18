package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1678
        // Input: command = "G()(al)"
        // Output: "Goal"

        String command = "G()(al)";

        System.out.println(interpret(command));

    }

    static public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i += 2;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l'
                    && command.charAt(i + 3) == ')') {
                sb.append("al");
                i += 4;
            } else {
                sb.append(command.charAt(i));
                i++;
            }
        }
        return sb.toString();

    }

}
