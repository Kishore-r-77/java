package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 22, 33, 44, 10, 8, 7, 2 };

		System.out.println(findPeakElement(nums));

	}

	static int findPeakElement(int arr[]) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - 1) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

}
