package JavaPractice;

public class a2b3c4d5e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a2b3c4d5e6";
		boolean z = a.matches(".*[a-zA-Z]+.*");//to check any one alphabet is there
		System.out.println(z);
		
		StringBuilder b = new StringBuilder();
     
		for (int i = 0; i<a.length(); i+=2) {
			char ch = a.charAt(i);           //get the character count as a 
			int count = a.charAt(i+1) - '0'; //convert char digit to int (like '2' -> 2

			for (int j = 0;  j < count; j++) {
				b.append(ch);                  //append character 'count' times
			}

		}



		System.out.println(b);
	}

}
