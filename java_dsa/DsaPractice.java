package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 ,8};
		
		System.out.println(dynamicSearch(nums, 7));

	}

	static int dynamicSearch(int[] arr, int target) {
		int start = 0;
		int end = 1;

		if (target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		return binarySearch(arr, target, start, end);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
