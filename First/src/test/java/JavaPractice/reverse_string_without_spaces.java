package JavaPractice;

public class reverse_string_without_spaces {

	public static void main (String[] args) {


		String a = "reversing this one";
		String b = "";

		for (int i = a.length()-1; i>=0; i--) {
			if (a.charAt(i) != ' ') {

				b = b + a.charAt(i);
			}

		}
		
		System.out.println(b);

	}

}
