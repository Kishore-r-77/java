package java_dsa;

public class DsaPractice {

	public static void main(String[] args) {

	}

	static int binarySearch(int start, int end, int[] arr, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			boolean isAsc = arr[start] < arr[end];
			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {

				if (arr[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (arr[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}
		}
		return -1;
	}
}
