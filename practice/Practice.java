package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 28

        // Input: haystack = "sadbutsad", needle = "sad"
        // Output: 0

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));

    }

    static public int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }

}
