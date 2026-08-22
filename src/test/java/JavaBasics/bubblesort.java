package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class bubblesort {

	// Main method where program execution starts.
	public static void main(String[] args) {

		int a[]= {2,2,3,3,6,1,4,9,9,10,64,74,33,1,1};
		int temp;
       
		// 1,2,3,4,6, 9

		for(int i=0;i<=a.length-1;i++)
		{
			// Loop through the data using an index or counter.
			for(int j=i+1;j<=a.length-1;j++)
			{
				// Check the condition before deciding whether this block should run.
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
			}
		}
		// Loop through the data using an index or counter.
		for(int i=0;i<=a.length-1;i++)
		{
			// Display information to the console for the user.
			System.out.print(a[i] + " ");
		}

	}

}
