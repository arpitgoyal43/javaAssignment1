import java.util.*;
import java.io.*;

class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		double p = in.nextDouble();
		System.out.println("Enter the rate of sinterest: ");
		double r = in.nextDouble();
		System.out.println("Enter the time: ");
		double t = in.nextDouble();
		double si=0;
		si = (p * r * t)/100;
		System.out.println("Simple Interest: "+si);	
	}
}
