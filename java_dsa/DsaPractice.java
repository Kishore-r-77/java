package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int[] nums = { 7,2,5,10,8};
		
		System.out.println(splitArray(nums, 2));

		

	}

	static int splitArray(int[] arr,int m) {
		int start=0;
		int end=0;
		
		for(int i =0;i<arr.length;i++) {
			start = Math.max(start, arr[i]);
			end+=arr[i];
		}
		
		while(start<end) {
			int mid=start+(end-start)/2;
			int pieces=1;
			int sum=0;
			for(int num:arr) {
				if(sum+num>mid) {
					sum=num;
					pieces++;
				}
				else {
					sum+=num;
				}
			}
			if(pieces<=m) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		
		
		return start;
	}
}
