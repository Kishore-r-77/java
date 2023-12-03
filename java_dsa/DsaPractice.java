package java_dsa;

public class DsaPractice {
	public static void main(String[] args) {

		int nums[] = {1234,222,343,22,1,34};
		
		System.out.println(countDigits(nums));
		
		

	}
	
	static int countDigits(int[] arr) {
		int count=0;
		for(int num:arr) {
			if(isEven(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean isEven(int num) {
		int noOfDigits=checkDigits(num);
		return noOfDigits%2==0;
	}
	
//	static int checkDigits(int num) {
//		int count=0;
//		if(num==0) {
//			return 1;
//		}
//		if(num<0) {
//			num*=-1;
//		}
//		while(num>0) {
//			count++;
//			num/=10;
//		}
//		return count;
//		
//	}
	
	static int checkDigits(int num) {
		return (int) Math.log10(num);
	}

	

}
