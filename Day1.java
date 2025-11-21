package JavaCoding;

public class Day1 {

	public static void main(String[] args)
	{
		
		String Input = "hello";
		
		String rev = "";
		
		for(int i = Input.length()-1;i>=0;i--)
		{
			char ch = Input.charAt(i);
			
			rev =rev + ch;
		}

		System.out.println(rev);
		
	}

}
