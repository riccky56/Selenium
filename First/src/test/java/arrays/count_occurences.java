package arrays;
public class count_occurences {
	public static void main(String[] args) {

		String a = "millionaire";

		char[] b = a.toLowerCase().toCharArray();

		boolean[] visited = new boolean[b.length];

		for(int i=0; i<a.length(); i++) 
		{
			if(visited[i]) 
			{
				continue;
			}

			int count = 1;
			for(int j=i+1; j<a.length(); j++) 
			{

				if(b[i] == b[j]) {
					count++;
					visited[j]=true;
				}
			}

			//System.out.println(b[i] + " : " + count );
		
			if(count>1) 
			{
				System.out.println(b[i] + " = " +count);
			}
		}
	}
}
