import java.util.*;

class Leapyear
{
	public static void main(String args[])
	{
		System.out.println("Enter any Year: ");
		Scanner in =  new Scanner(System.in);
		int year = in.nextInt();
		if(year%4==0 || year%400==0)
		{
			
			if(year%100!=0)
				System.out.println(year + " is a leap year");
			else
				System.out.println(year + " is not a leap year");
		}
		else
			System.out.println(year + " is not a leap year");	
	}
}		
