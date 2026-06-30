package JavaPractice;

import java.util.Scanner;

import net.bytebuddy.implementation.EqualsMethod;

public class palindrome_checking_complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Scanner sc = new Scanner(System.in); // if you want to enter a string and check for it
		System.out.println("Enter the string : ");
		String a = sc.nextLine(); */
		
		
		String a = "A man, a plan, a canal: Panama";
	
		String b = "";
		String c = "";


		for (int i = a.length()-1; i>= 0; i--) {
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != ':' ) {

				b = b + a.charAt(i);

			}  
		}	
		
		System.out.println(b); // just for checking

		for (int i = 0; i<= a.length()-1; i++){
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != ':' ) {

				c = c + a.charAt(i);
			}
		}
		
		System.out.println(c); //just for reference
		

		if(c.equalsIgnoreCase(b)) {
			System.out.println("String "  +a+ " is a palindrome");
		}
		else {
			System.out.println("String "  +a+ " is not a palindrome");
		} 
	}
}
