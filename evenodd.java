import java.util.Scanner;

class Evenodd
{
	public static void main(String args[])
	{
		System.out.println("Enter any Number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%2==0)
			System.out.println(num + " is an Even number.");
		else
			System.out.println(num + " is an Odd number.");
	}
}