import java.util.Scanner;

class BinaryNumber
{
	public static void main(String args[])
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter binay no. 1 : ");
		int num1 = in.nextInt();
		System.out.println("Enter binay no. 2 : ");
		int num2 = in.nextInt();
		int carry =0, i=0;
		int [] sum = new int[20];
		
		while(num1!=0 || num2!=0)
		{
			sum[i++] = ((num1%10 + num2%10 + carry) % 2);
			carry = ((num1%10 + num2%10 + carry) / 2);
			num1 = num1/10;
			num2 = num2/10;
		}
		if(carry!=0)
			sum[i++] = carry;
		System.out.println("Addition of two Binary number: ");
		--i;
		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
	}
}	



