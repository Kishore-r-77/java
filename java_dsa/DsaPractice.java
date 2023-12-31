package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = new int[] { 5, 4, 3, 2, 1 };
		System.out.println(binarySearch(nums, 4));

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[target];
		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target > arr[mid]) {
					start = start + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = start + 1;
				}
			}
		}
		return -1;
	}

}
