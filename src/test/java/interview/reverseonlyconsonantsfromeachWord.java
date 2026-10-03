package interview;

import java.util.Arrays;

public class reverseonlyconsonantsfromeachWord {
	
	public static void main(String[] args) {
		
		
		String str = "My name is rahul gupta";
		String[] words = str.split(" ");
		
		int i = 0;
		while(i<words.length) {
			
			char[] ch =words[i].toCharArray();
			
			int left = 0;  int right = ch.length-1;
			
			while(left<right) {
				
				if("aeiouAEIOU".indexOf(ch[left]) != -1) {
					
					left++ ;
					
				}
				else if ("aeiouAEIOU".indexOf(ch[right]) != -1) 
				{
					right-- ;
				}
				else 
				{
					char temp = ch[left];
					ch[left]= ch[right];
					ch[right]=temp;
					left++;
					right--;
				}
				
			}
			words[i]= new String (ch);
			i++;
				
			
		}
		System.out.println(String.join(" ", words));
	}

}
