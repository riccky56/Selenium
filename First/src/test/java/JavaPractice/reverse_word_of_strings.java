package JavaPractice;

public class reverse_word_of_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "java is a programming language";
		String b = "";
		String[] words = a.split(" ");
		
		for(String word: words) {
			
			String rev="";
			
			for(int i = word.length()-1; i>=0; i--) {
				
				rev= rev + word.charAt(i);
			}
			//System.out.print(rev+ " ");
			
			b= b + rev + " ";
		}
		System.out.println(b);
		
	}}
		
		