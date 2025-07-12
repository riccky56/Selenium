package arrays;
import java.util.Arrays;

public class reverseonlyfourthword {
	public static void main(String[] args) {
		
		String a = "Java is a capgemini language";
		String[] word = a.split(" ");

		for(int i =0; i<word.length; i++) {
			if(i==3 ) 
			{
				String rev="";
				for(int j = word[i].length()-1; j>=0; j--)
				{
					rev= rev+word[i].charAt(j);

				}
				word[i]= rev;

			}
			System.out.print(word[i]+ " ");

		}
		System.out.println(" ");
		//to convert into string        
		String c = Arrays.toString(word);

		System.out.println(c);
		System.out.println(" ");

		// to get in string format without commas
		for(String e:word) 
		{

			System.out.print(e + " ");

		}

	}

}
