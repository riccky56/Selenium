package Hashmapexamples;

public class removeduplicatefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "cabbage";
		String b = "";
		for(int i=0; i<=a.length()-1; i++) {
			char ch = a.charAt(i);
		     
				if(b.indexOf(ch) == -1) 
				{
					b = b + ch;
				}
			
			}
		System.out.println(b);
			
	}

}
