package arrays;

public class check_string_for_alphabets {

	public static void main(String[] args) {
		
		String a = "10";
		String b = "20";
		
		String  result = "";
	
		if(a.matches("[0-9]+") && b.matches("[0-9]+"))
		{
			int sum = Integer.parseInt(a) + Integer.parseInt(b);
			
			result = String.valueOf(sum);
			
		} else {
			
			result = a+" "+ b;
		}
	
		
		System.out.println(result);	

	}

}
