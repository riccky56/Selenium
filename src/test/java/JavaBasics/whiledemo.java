package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class whiledemo {

	// Main method where program execution starts.
	public static void main (String[] args) {
		//While loop
		//1 to 10 
		int i=10;

		// Continue looping while the given condition remains true.
		while(i>0) {

			// Display information to the console for the user.
			System.out.println(i);
			i--;//i=2
		}
	// 1 loop of execution is guarantee

	// For if loop

	// TODO Auto-generated method stub

	// 1 to 10

	/* for(initization;condition;increment)
		{

		}*/
	// Check the condition before deciding whether this block should run.
	if(5>2)
	{

		// Display information to the console for the user.
		System.out.println("success");
		// Display information to the console for the user.
		System.out.println("second step");
	}

	// Execute this block when the earlier conditions do not match.
	else

		// Display information to the console for the user.
		System.out.println("fail");

	// Loop through the data using an index or counter.
	for(int j=0;j<10;j=j+3)
	{
		// Check the condition before deciding whether this block should run.
		if(j==9)
			// Display information to the console for the user.
			System.out.println(" 9 is displayed");
		// Execute this block when the earlier conditions do not match.
		else
			System.out.println("I didnot find");//
	}
}
}
