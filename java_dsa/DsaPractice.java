package java_dsa;

public class DsaPractice {

	public static void main(String[] args) {
		// Input: gain = [-5,1,5,0,-7]
		// Output: 1
		// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

		int[] gain = { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(gain));
	}

	static int largestAltitude(int[] gain) {
		int res = 0;
		int alt = 0;
		for (int climb : gain) {
			alt += climb;
			res = Math.max(res, alt);
		}
		return res;
	}

}
