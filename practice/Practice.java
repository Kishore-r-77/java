package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1309
        // Input: s = "10#11#12"
        // Output: "jkab"
        // Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

        String s = "10#11#12";

        System.out.println(freqAlphabets(s));

    }

    static public String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                sb.append((char) ('a' + num - 1));
                i += 3;
            } else {
                int num = s.charAt(i) - '0';
                sb.append((char) ('a' + num - 1));
                i++;
            }

        }

        return sb.toString();
    }

}
