package practice;

class Practice {

	public static void main(String[] args) {

			String name="Kishore";
			name=reverseString(name);
			System.out.println(name);
			
	}
	
	
		static String reverseString(String name) {
			char[] reverseArray=name.toCharArray();
			
			int start=0;
			int end = reverseArray.length-1;
			while(start<end) {
				char temp =reverseArray[start];
				reverseArray[start]=reverseArray[end];
				reverseArray[end]=temp;
				start++;
				end--;
			}
			String result=new String(reverseArray);
			
			return result;
		}
	
	
	
}
