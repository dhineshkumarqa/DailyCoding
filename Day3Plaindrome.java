package JavaCoding;

import java.util.Scanner;

public class Day3Plaindrome {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the palindrome value:");
		int num =  sc.nextInt();
		
		int rem;
		int reverse = 0;
		int orginal = num;
		
		while(num>0)
		{
			rem = num%10;
			reverse = reverse*10+rem;
			num = num/10;
		}
		
		if(orginal==reverse)
		{
			System.out.println("it is a palindrome");
		}

		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
