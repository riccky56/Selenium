package Hashmapexamples;

public class secondlargestinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] a = {1,1,54,1,4,2,6,5,4,5,5,23,23,45,67,4,4};
		int largest= Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for(int i = 0; i<a.length; i++) {

			if(a[i] > largest)
			{
				secondlargest=largest;
				largest =  a[i];
			}

			else if(a[i] > secondlargest && a[i] !=largest) {

				secondlargest = a[i];
			}
		}
		System.out.println("Largest: " +largest);
		System.out.println("Second Largest: " +secondlargest);
	}}
