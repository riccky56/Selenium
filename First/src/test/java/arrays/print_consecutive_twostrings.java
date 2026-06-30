package arrays;

public class print_consecutive_twostrings {

	public static void main(String[] args) {
		String a = "RahulGupta";
		String b= "1234556@&^%&";

		int len = Math.min(a.length(), b.length());

		for(int i=0; i<len;i++) 
		{
			System.out.print(a.charAt(i));
			System.out.print(b.charAt(i));

		}

		if(a.length()>len)
		{
			System.out.println(a.substring(len));
		}
		else if(b.length()>len)
		{
			System.out.println(b.substring(len));
		}
	}

}
