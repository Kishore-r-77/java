package practice;

class Practice {
    public static void main(String[] args) {
        // Input: nums = [12,345,2,6,7896]
        // Output: 2

        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumbers(nums));

    }

    static public int findNumbers(int[] nums) {
        int count = 0;

        for (int i : nums) {
            if (coundDigits(i) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static public int coundDigits(int num) {
        int count = 0;
        while (num / 10 != 0) {
            num /= 10;
            count++;
        }
        return count + 1;
    }
}
