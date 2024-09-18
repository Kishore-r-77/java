package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1528
        // Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        // Output: "leetcode"

        String address = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

        System.out.println(restoreString(address, indices));

    }

    static public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for (int i = 0; i < result.length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }

}
