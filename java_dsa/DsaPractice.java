package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 7,2,5,10,8};
		
		System.out.println(splitArray(nums, 2));

		

	}

	static public int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;

        for (int i : arr) {
            start = Math.max(start, i);
            end += i;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int pieces = countPieces(arr, mid);

            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static private int countPieces(int[] arr, int targetSum) {
        int pieces = 1;
        int sum = 0;

        for (int num : arr) {
            if (sum + num > targetSum) {
                sum = num;
                pieces++;
            } else {
                sum += num;
            }
        }

        return pieces;
    }
}
