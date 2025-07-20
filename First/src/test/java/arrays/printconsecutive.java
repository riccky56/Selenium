package arrays;

public class printconsecutive {

	public static void main(String[] args) {
		String a = "RahulGuptaistester";
		String b= "12345523456@&^%";
		StringBuilder sb = new StringBuilder();

		int i=0;
		int len1 = a.length();
		int len2 = b.length();

		while(i<len1 || i<len2) {
			if(i<len1) {
				sb.append(a.charAt(i));
			}
			if(i<len2) {
				sb.append(b.charAt(i));
			}
			i++;
		}
		System.out.println(sb.toString());

	}
}