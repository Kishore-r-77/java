package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 14

        // Input: strs = ["flower","flow","flight"]
        // Output: "fl"

        String[] strs = { "flower", "flow", "flight" };

        System.out.println(longestCommonPrefix(strs));

    }

    static public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
