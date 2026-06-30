package arrays;

public class longest_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcadwsasdddeeaa";
		String longest  = "";		String current = "";
		for(char c: a.toCharArray()){
			
			String ch = String.valueOf(c);
			
              if(current.contains(ch))
              {
				  current = current.substring(current.indexOf(ch)+1);
			  }
			current +=ch;
			if(current.length()>longest.length()) {
				longest=current;
		}}
		System.out.println(longest);
	}}


