package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class stringarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"rahul", "shetty", "selenium"};
		
   
		// Loop through the data using an index or counter.
		for(int i =0; i<name.length;i++){

			// Display information to the console for the user.
			System.out.print(name[i]);
			// Display information to the console for the user.
			System.out.print(" ");
		}
		// Display information to the console for the user.
		System.out.println(" ");
		// Loop through each element one by one.
		for( String s: name)
		{
      
			// Display information to the console for the user.
			System.out.println(s);
		}
	}
}
