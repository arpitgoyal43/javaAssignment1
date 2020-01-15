import java.util.Scanner;

class CompoundInterest
{
	public static void main(String args[])
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		double principle = in.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double rate = in.nextDouble();
		System.out.println("Enter the time: ");
		double time = in.nextDouble();
		double ci = principle*(Math.pow((1+rate/100),time));
		System.out.println("Compound Interest : " + ci);
	}
}



