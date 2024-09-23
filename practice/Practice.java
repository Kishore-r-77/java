package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 925

        // Input: name = "alex", typed = "aaleex"
        // Output: true

        String name = "alex";
        String typed = "aaleex";

        System.out.println(isLongPressedName(name, typed));

    }

    static public boolean isLongPressedName(String name, String typed) {

        if (name.length() > typed.length()) {
            return false;
        }

        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }

        return i == name.length();

    }

}
