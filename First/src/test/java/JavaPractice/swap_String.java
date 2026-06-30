package JavaPractice;


public class swap_String {

	public static void main(String[] args) {


		String a = "rahul";
		String b = "gupta";

		a = a + b;
		b = a.substring(0,a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("String1 = " +a);
		System.out.println("String2 = " +b);
	}

}
