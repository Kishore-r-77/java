package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 680

        // Input: s = "cxcaac"
        // Output: false

        String s = "cxcaac";

        System.out.println(validPalindrome(s));

    }

    static public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        if (checkPalindrome(start, end, s)) {
            return true;
        }

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if (checkPalindrome(start + 1, end, s)) {
                    return true;
                } else if (checkPalindrome(start, end - 1, s)) {
                    return true;
                } else {
                    return false;
                }

            }
            start++;
            end--;
        }

        return true;
    }

    static public boolean checkPalindrome(int start, int end, String s) {

        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}
