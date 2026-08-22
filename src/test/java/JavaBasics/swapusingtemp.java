package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class swapusingtemp {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 5;
		// Initialize a variable that will be used in the logic.
		int b =4;
		int temp;
		temp=a;
		a=b;
		b=temp;
		// Display information to the console for the user.
		System.out.println(a);
		// Display information to the console for the user.
		System.out.println(b);
		
		
		//Swap with out variable

		a=a+b;  // a= 9
		b=a-b;  //b = 5
		a=a-b; // a= 4  
		// Display information to the console for the user.
		System.out.println(a);
		// Display information to the console for the user.
		System.out.println(b);
	}

}
