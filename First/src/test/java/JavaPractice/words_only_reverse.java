package JavaPractice;

public class words_only_reverse {
	
	public static void main(String[] args) {
		
		String s = "rahul gupta is a tester";
		String[] word =  s.split(" ");
	
		for (int i = word.length-1;i>=0; i--) {
			
			System.out.print(word[i]+ " ");
		}
		
		
	}

}
