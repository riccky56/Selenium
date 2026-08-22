package arrays;

// Class declaration that groups the related example logic in one place.
public class countduplicateinStrings {

	// Main method where program execution starts.
	public static void main(String[] args) {


		// Store text data that will be processed by the program logic.
		String a = "millionaire";

		char[] b = a.toLowerCase().toCharArray();

		boolean[] visited = new boolean[b.length];

		// Loop through the data using an index or counter.
		for(int i=0; i<a.length(); i++) 
		{
			// Check the condition before deciding whether this block should run.
			if(visited[i]) 
			{
				continue;
			}

			// Initialize a variable that will be used in the logic.
			int count = 1;
			// Loop through the data using an index or counter.
			for(int j=i+1; j<a.length(); j++) 
			{

				// Check the condition before deciding whether this block should run.
				if(b[i] == b[j]) {
					count++;
					visited[j]=true;
				}
			}

			//System.out.println(b[i] + " : " + count );

			if(count>1) 
			{
				// Display information to the console for the user.
				System.out.println(b[i] + " = " +count);
			}
		}


	}

}
