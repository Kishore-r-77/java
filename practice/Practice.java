package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1704
        // Input: s = "book"
        // Output: true

        String s = "book";

        System.out.println(halvesAreAlike(s));

    }

    static public boolean halvesAreAlike(String s) {

        String vowels = "aeiou";

        int mid = s.length() / 2;

        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid, s.length());

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < firstHalf.length(); i++) {
            if (vowels.contains(firstHalf.charAt(i) + "")) {
                count1++;
            }
            if (vowels.contains(secondHalf.charAt(i) + "")) {
                count2++;
            }
        }

        return count1 == count2;
    }

}
