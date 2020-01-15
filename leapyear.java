import java.util.Scanner;

class Leapyear
{
	public static void main(String args[]) {
		System.out.println("Enter any Year: ");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		Leapyear leap = new Leapyear();
		if(leap.isLeap(year))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}

	public boolean isLeap(int year){
		if(year%4==0 || year%400==0)
		{
			
			if(year%100!=0)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}		
