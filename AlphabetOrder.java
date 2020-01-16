import java.util.Scanner;

class AlphabetOrder {
	public static void main(String args[]) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter no. of strings: ");
		int count = input1.nextInt();
		String[] str = new String[count];
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the strings to be sorted in a sequence: ");
		for (int i = 0; i <count; i++) {
			str[i] = input2.nextLine();
		}
		String temp;
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Sorted strings in upper to lower format: ");
		for(int i=0;i<count;i++)
		{
			System.out.println(str[i]);
		}
	}
}