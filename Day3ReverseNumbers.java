package JavaCoding;

public class Day3ReverseNumbers {

	public static void main(String[] args)
	{
		int reverse = 0;
		int num =1234;
		int rem;
		
		while(num>0)
		{
			rem = num%10;
			reverse = reverse*10+rem;
			num = num/10;
		}
		System.out.println(reverse);

	}

}
