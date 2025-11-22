package JavaCoding;

public class Day2LeapYear {

	public static void main(String[] args)
	{
		
		int Year = 1909;
		
		if(Year%400==0)
		{
			System.out.println(Year + " It is a leap year");
		}
		if(Year%4==0 && Year%100!=0)
		{
			System.out.println(Year + " It is a leap year");
		}
		else
		{
			System.out.println(Year + " It is a not leap year");
		}

	}

}
