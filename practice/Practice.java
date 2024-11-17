package practice;

class Practice {
    public static void main(String[] args) {

        // Input : geeksforgeeKs
        // Output : K

        // Input : geekS
        // Output : S

        String s = "geeksforgees";

        System.out.println(firstCapitalLetter(s));

    }

    static public char firstCapitalLetter(String s) {
        return recursiveSearch(s, 0);

    }

    static public char recursiveSearch(String s, int index) {
        if (index == s.length()) {
            throw new IllegalArgumentException("No capital letter found");
        }

        char currentChar = s.charAt(index);

        if (Character.isUpperCase(currentChar)) {
            return currentChar;
        }

        return recursiveSearch(s, index + 1);
    }

}
