package JavaBasics;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {

	
		// to dynamically change and increase the size of array we use array list
		ArrayList<String> a = new ArrayList<String>();
		// To add in array list	 
		a.add("rahul");
		a.add("gupta");
		a.add("is");
		a.add("a");
		a.add("tester");

		System.out.println(a);
        
       a.set(0, " ji ");
       System.out.println(a.get(0));
       System.out.println(a);
		// to get the 1st index value or second value of arraylist
		System.out.println(a.get(1));

		System.out.println("          ");
		//to check if the array list contains the element or not
				System.out.println(a.contains("gupta"));
				System.out.println("------------");	
		//To delete from a array list	 
		a.remove(1);
		System.out.println(a);

		System.out.println("------------");
		// for loop 
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));

		} 
		System.out.println("------------");
		
		// enhanced for loop

		for (String b : a) {
			System.out.println(b);
		}
		System.out.println("------------");
		// to convert from traditional array to dynamic or Arraylist we use this 
		
		String[] name = {"rahul", "shetty", "selenium"};
		List<String> D = Arrays.asList(name);
		System.out.println(D);
		System.out.println(a.contains("tester"));

	}

}
