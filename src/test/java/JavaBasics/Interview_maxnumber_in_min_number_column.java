package JavaBasics;
// Class declaration that groups the related example logic in one place.
public class Interview_maxnumber_in_min_number_column {

	// Main method where program execution starts.
	public static void main(String[] args) {

		int abc[][] = {{2,4,5},{3,2,10},{1,2,0}};
		// Initialize a variable that will be used in the logic.
		int min=abc[0][0];
		// Initialize a variable that will be used in the logic.
		int mincoloumn = 0;

		// Loop through the data using an index or counter.
		for(int i=0;i<3;i++){
			// Loop through the data using an index or counter.
			for(int j=0;j<3;j++){
				if(abc[i][j]<min)     //2
				{
					min=abc[i][j];
					mincoloumn=j;
				}
			}
		}
		//=1 column number index
		int max=abc[0][mincoloumn];
		// Initialize a variable that will be used in the logic.
		int k = 0;
		// Continue looping while the given condition remains true.
		while(k<3)
		{
			// Check the condition before deciding whether this block should run.
			if(abc[k][mincoloumn]>max)
			{
				max=abc[k][mincoloumn];
			}
			k++;
		}

		// Display information to the console for the user.
		System.out.println(max);
	}

}
