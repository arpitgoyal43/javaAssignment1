import java.util.*;
import java.io.*;

class CompoundInterest
{
	public static void main(String args[])
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		double p = in.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double r = in.nextDouble();
		System.out.println("Enter the time: ");
		double t = in.nextDouble();
		double amt=0;
		amt = p*(Math.pow((1+r/100),t));
		System.out.println("Compound Interest : " + amt);	
	}
}



