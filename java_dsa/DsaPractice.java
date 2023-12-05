package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

	
		int numbers[]= {1,3,4,5,7};
		System.out.println(ceiling(numbers,6));
		

	}
	
	static int ceiling(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		if(target>arr[end]) {
			return -1;
		}
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			
			if(target==arr[mid]) {
				return mid;
			}
			if(isAsc) {
				if(target>arr[mid]) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {
				if(target>arr[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			
		}
		return start;
	}
	

}
