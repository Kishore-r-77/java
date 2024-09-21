package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 557

        // Input: s = "Let's take LeetCode contest"
        // Output: "s'teL ekat edoCteeL tsetnoc"

        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));

    }

    static public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] stringArray = s.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            sb.append(swap(stringArray[i]) + " ");
        }

        return sb.toString().trim();

    }

    static String swap(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);

    }
}
