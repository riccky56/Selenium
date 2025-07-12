package JavaPractice;

import java.util.Scanner;

public class vowelsonlyreverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // if you want to enter a string and check for it
		System.out.println("Enter the string : ");
		String a = sc.nextLine(); 

		StringBuilder sb = new StringBuilder(a);

		for(int i = 0; i<a.length(); i++) {
			if (a.charAt(i) ==  'a'|| a.charAt(i)=='e' ||  a.charAt(i) =='i' ||  a.charAt(i) == 'o' ||  a.charAt(i)== 'u') {

				sb.append(a.charAt(i));
			}
		}
		
		System.out.println(sb);
		
		int j = sb.length()-1;
		//System.out.println(j); // total number of characters

		for ( int i=0;i < a.length(); i++) {

			if(a.charAt(i) == 'a' || a.charAt(i)=='e' || a.charAt(i)=='i' ||a.charAt(i)== 'o' || a.charAt(i)== 'u') {
                
				sb.setCharAt(i, sb.charAt(j));
				sb.deleteCharAt(j);
				j--;

			}
		}
		System.out.println("string : " + sb );
	}

}
