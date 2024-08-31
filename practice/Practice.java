package practice;

class Practice {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(binarySearch(arr, 3));

	}

	static int binarySearch(int[] arr, int val) {
		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == val) {
				return mid;
			}
			if (isAsc) {
				if (val < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (val < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}

}
