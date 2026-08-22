package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class arrays {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Initialize a variable that will be used in the logic.
		int myNum = 5;

		// Store text data that will be processed by the program logic.
		String website = "Rahul Shetty Academy";

		// Read or store the current character needed for processing.
		char letter = 'r';

		// Initialize a numeric variable used by the program.
		double dec = 5.99;

		// Store a true or false state needed for conditional logic.
		boolean myCard = true;



		// Display information to the console for the user.
		System.out.println(myNum+"is the value stored in the myNum variable");

		// Display information to the console for the user.
		System.out.println(website);

		//Arrays -

		int[] arr = new int[5];// 5, 10

		arr[0] = 1;     arr[1] = 2;      arr[2]= 4;

		arr[3]= 5; 		arr[4]= 6;


		// Declare and initialize an integer array used in this example.
		int[] arr2 = {1,2,4,5,6};

		// Display information to the console for the user.
		System.out.println(arr2[0]);

		// Loop through each element one by one.
		for(int a:arr2) {
			// Display information to the console for the user.
			System.out.print(a +",");
		}
		//for loop arr.length
		

		for(int i = 0; i< arr.length; i++) //4

		{
			// Display information to the console for the user.
			System.out.print(arr[i]);
		}

		// Loop through the data using an index or counter.
		for (int i =0;i<arr2.length; i++)

		{
			// Display information to the console for the user.
			System.out.println(arr2[i]);
		}

		String[] name = {"rahul", "shetty", "selenium"};

		// Loop through the data using an index or counter.
		for(int i =0; i<name.length;i++)

		{
			// Display information to the console for the user.
			System.out.println(name[i]);
		}

		// Loop through each element one by one.
		for( String s: name)

		{

			// Display information to the console for the user.
			System.out.println(s);

		}



	}





}
