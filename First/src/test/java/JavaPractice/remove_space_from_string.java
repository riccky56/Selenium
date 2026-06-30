package JavaPractice;

public class remove_space_from_string {

	public static void main(String[] args) {
		String a = "remove space from string";
		String b = "";
	  	//  String z = a.replace(" ", ""); one way to do remove spaces
		// System.out.println(z);

		for (int i = 0; i<= a.length()-1; i++){
			if (a.charAt(i) != ' ') {

				b = b + a.charAt(i);
			}
		}
		System.out.println(b);
	}
}