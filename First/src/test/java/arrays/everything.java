package arrays;

public class everything {

	public static void main(String[] args) {
		
		String a = "Test1233Gtsag!@#$dwdb1234";
		
		String letters ="";
		String digit ="";
		String special ="";
		for( char c :a.toCharArray()) {
			
			if(Character.isLetter(c)) {
				letters = letters + c;
			}else if(Character.isDigit(c)) {
				digit = digit + c;
			}else {
				special = special+c;
			}
			
		}
		System.out.println("Printed Letters : " +letters);
		System.out.println("Printed Letters : " +digit);
		System.out.println("Printed specials : " +special);

	}

}
