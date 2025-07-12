package JavaBasics;

import java.util.Arrays;

public class SortArray		{
	public static void main(String[] args)
	{
		// Number Array sorting
		int data[] = { 4, 10, 2, 6, 1 };
		Arrays.sort(data);
		
		for (int c : data)
		{
			System.out.print(c +" ");
		}
		System.out.println();
		// String array sorting
		String data2[] = { "z", "a", "x" };
		Arrays.sort(data2);
		for (String c : data2)
		{
			System.out.println(c);
		}
	}




}
