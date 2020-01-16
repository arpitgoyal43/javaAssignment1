import java.util.Scanner;

class PalindromString
{
	public static void main(String args[])
	{
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter any word: ");
		String word = input.nextLine();
		if(isPalindrom(word))
			System.out.println(word + " is a palindrom string");
		else
			System.out.println(word + " is not a palindrom string");
	
	}

	static boolean isPalindrom(String word)
	{
		for(int i=0, j=word.length()-1; i<j;i++,j--){
			if(word.charAt(i) != word.charAt(j))
				return false;
		}
		return true;	
	}
}