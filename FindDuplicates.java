import java.util.Scanner;

class FindDuplicate
{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = in.nextLine();
		FindDuplicate fd = new FindDuplicate();
		System.out.println("Duplicate String: ");
		fd.duplicatechar(str);
	}

	public void duplicatechar(String str){
		char[] str_array = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str_array[i]==str_array[j])
				{	System.out.print(str_array[j] + " ");
					break;
				}
			}
		}
	}
}	