package arrays;

// Class declaration that groups the related example logic in one place.
public class upperlower {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rahulguptaistester";
		// Store text data that will be processed by the program logic.
		String result="";
		
		// Loop through the data using an index or counter.
		for(int i=0; i<s.length()-2;i+=2)
		{
			// Read or store the current character needed for processing.
			char a = s.toLowerCase().charAt(i);
			// Read or store the current character needed for processing.
			char b= s.toUpperCase().charAt(i+1);
			
			// Update the variable based on the current calculation.
			result = result + a + b;
			//i++;  // to get the third character now then fifth use with i++ in the forloop 
			
			
		}
		
		// Display information to the console for the user.
		System.out.println(result);
		

	}

}
