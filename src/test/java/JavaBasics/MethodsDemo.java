package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class MethodsDemo {



	// Main method where program execution starts.
	public static void main(String[] args) {

		// TODO Auto-generated method stub



		MethodsDemo d = new MethodsDemo();

		// Store text data that will be processed by the program logic.
		String name = d.getData();

		// Display information to the console for the user.
		System.out.println(name);

		getData2();

	}



	public String getData()

	{

		// Display information to the console for the user.
		System.out.println ("hello world");

		// Return the final result back to the caller.
		return "rahul shetty";

	}



	// Helper method used to perform a specific part of the program logic.
	public static String getData2()

	{

		// Display information to the console for the user.
		System.out.println ("hello world");

		// Return the final result back to the caller.
		return "rahul shetty";

	}

}

