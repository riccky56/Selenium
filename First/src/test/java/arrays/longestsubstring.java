package arrays;
public class longestsubstring {

	public static void main(String[] args) {
		
		String s = "abcabcbbd";
		
		String longest="";	String current = "";
		
		for(char c : s.toCharArray()) {
			String ch = String.valueOf(c);
				
			if(current.contains(ch))
			{
				current = current.substring(current.indexOf(ch) + 1);
				
			}
			current = current+ch;
			
			if(current.length()>longest.length()) 
			{
				
				longest = current;
			}
			
		}
		System.out.println(longest);
	}

}
