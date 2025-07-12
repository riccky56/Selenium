package JavaBasics;

public class bubblesort {

	public static void main(String[] args) {

		int a[]= {2,2,3,3,6,1,4,9,9,10,64,74,33,1,1};
		int temp;
       
		// 1,2,3,4,6, 9

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		}

	}

}