import java.util.Scanner;

class PalindromString
{
	public static void main(String args[])
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = in.nextLine();
		if(isPalindrom(str))
			System.out.println(str + " is a palindrom string");
		else
			System.out.println(str + " is not a palindrom string");
	
	}

	static boolean isPalindrom(String str)
	{
		int i=0,j=str.length()-1;		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;	
	}
}