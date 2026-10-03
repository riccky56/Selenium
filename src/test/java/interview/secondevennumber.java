package interview;

public class secondevennumber {

	public static void main(String[] args) {
		
		int num = 139236939;
		
		String str = String.valueOf(num);
		int count = 0;
		
		for(int i = 0; i< str.length(); i++) {
			
			int digit = str.charAt(i) - '0';
			
			if(digit%2 == 0) {
				count++;
				if(count == 2) {
					System.out.println("Found the second even digit : " +digit);
					break;
				}	
			}
			
			
		}
		
	}
}
