package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 852

        // Input: arr = [0,1,0]

        // Output: 1

        int[] nums = { 0, 1, 0 };

        System.out.println(peakIndexInMountainArray(nums));

    }

    static public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;

    }

}
