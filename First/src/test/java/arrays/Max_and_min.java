package arrays;

public class Max_and_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {21,25,65,34,69,23,45};

		int small = a[0];
		int large = a[0];

		for (int i =0; i<a.length; i++)
		{

			if(a[i]<small) {
				small=a[i];
			}
			if(a[i]>large) {
				large=a[i];
			}
			
		}
		
		int difference =  large - small;
		System.out.println("minimum : " + small);
		System.out.println("maximum : " + large);

		System.out.println("Difference : " + difference);
	}


}
