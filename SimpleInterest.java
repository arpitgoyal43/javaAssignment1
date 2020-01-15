import java.util.Scanner;

class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		double principle = in.nextDouble();
		System.out.println("Enter the rate of sinterest: ");
		double rate = in.nextDouble();
		System.out.println("Enter the time: ");
		double time = in.nextDouble();
		double si = (principle * rate * time)/100;
		System.out.println("Simple Interest: "+si);
	}
}
