import java.util.*;

class VowelConsonant
{
	public static void main(String args[])
	{
		System.out.println("Enter any Character: ");
		Scanner in =  new Scanner(System.in);
		char ch = in.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U')
			System.out.println(ch + ": is a vowel");
		else
			System.out.println(ch + ": is a consonant");
	}
}