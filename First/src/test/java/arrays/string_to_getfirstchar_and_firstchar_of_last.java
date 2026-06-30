package arrays;

import java.util.Arrays;

public class string_to_getfirstchar_and_firstchar_of_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Name is RAhul guPta";
		String b = a.toUpperCase();
		
		String[] c = b.split(" ");
		
		System.out.println(Arrays.toString(c));
		
		
		 char d = c[0].charAt(0) ;
		 
		 char e = c[c.length-1].charAt(0);
		 
		 System.out.println( d + " " + e);
		

}}
