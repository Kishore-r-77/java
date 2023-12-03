package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int[][] nums = {
				{100},
				{1,2,4},
				{1,2,5}
		};
		System.out.println(findMaxWealth(nums));

	}

	static int findMaxWealth(int[][] nums) {
		
		int ans = 0;
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=0;j<nums[i].length;j++) {
				sum+=nums[i][j];
			}
			if(ans<sum) {
				ans=sum;
			}
		}
		return ans;
	}

}
