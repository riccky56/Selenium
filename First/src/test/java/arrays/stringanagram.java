package arrays;

public class stringanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "rahul";
		 String b = "";
		 
		 String c = "";
		for(int i = a.length()-2; i>=0; i--) {
			
			b = b+a.charAt(i);
			
		}
		 c= a+b;
		
		System.out.println(b);
		System.out.println(c);
		
		String d="";
		for(int i=c.length()-1; i>=0; i--) {
			
			d=d+c.charAt(i);
		}
		
		System.out.println(d);
	
		if(c.equalsIgnoreCase(d)) {
			System.out.println("is a palindrome");
		}else {
		System.out.println("is not a palindrome");
	}
	
}
}
