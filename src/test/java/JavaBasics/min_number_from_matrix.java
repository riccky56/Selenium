package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class min_number_from_matrix {
	/*2  4  5

	3  4  7

	1  2  9*/
	//Maximum number from the array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]={{5,4,5},{3,6,10},{10,9,5}};

		// Initialize a variable that will be used in the logic.
		int min=abc[0][0];

		// Loop through the data using an index or counter.
		for(int i=0;i<3;i++)
		{
			// Loop through the data using an index or counter.
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)  //3
				{
					min=abc[i][j];
				}
			}
		}
		// Display information to the console for the user.
		System.out.println(min);
	}

}
